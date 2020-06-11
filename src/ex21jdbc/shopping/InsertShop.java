package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop() {
		super("study","1234");
	}
	
	@Override
	public void execute() {
		try {
			//1.쿼리문준비 : 값의 세팅이 필요한 부분을 ?로 대체한다.
			String query = "INSERT INTO sh_goods VALUES (goods_seq.nextval, ?, ?, SYSDATE, ?)";
			
			//2.prepared객체 생성 : 생성시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//4.인파라미터 설정하기 : ?의 순서대로 설정하고 dB이므로 인덱스는 1부터 시작.
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			/*
			인파라미터 설정시 사용하는 메소드
			 	쿼리문에?가 있는 부분에 인덱스로 접근해서 설정한다.
			 	자료형이
			 		숫자면 setInt()
			 		문자면 setString()
			 		날짜면 setDate()를 사용한다.
			 	해당 메소드 사용시 '(싱클쿼테이션)은 자동으로 삽입된다.
			 */
			
			//5.쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	

	public static void main(String[] args) {
		new InsertShop().execute();
	}
}