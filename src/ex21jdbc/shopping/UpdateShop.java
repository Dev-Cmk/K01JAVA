package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	
	public UpdateShop() {
		super("study","1234");
	}
	
	@Override
	public void execute() {
		try {
			//1. callable객체 생성
			/*
			  프로시저는 return값이 없으므로 함수처럼 ?=로 시작하지 않음
			 return값 대신 out파라미터를 통해 값을 반환받음
			 */
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			//2-1. in파라미터 설정
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("가격"));
			csmt.setString(3, scanValue("제품코드"));
			csmt.setString(4, scanValue("일련번호"));
			//2-2. out파라미터 설정
			csmt.registerOutParameter(5, Types.NUMERIC);
			//3. 실행
			csmt.execute();
			int affected= csmt.getInt(5);
			//4. out파라미터의 할당된 값을 읽어서 결과를 출력한다.
			if(affected==0)
				System.out.println("수정실패");
			else
				System.out.println(affected+"행 수정성공");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute(); 
	}

}
