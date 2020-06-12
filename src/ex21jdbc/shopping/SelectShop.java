package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl {

	public SelectShop() {
		super("study","1234");
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			Scanner scan = new Scanner(System.in);
			System.out.print("검색할 상품명:");
			String name = scan.nextLine();

			String query = "SELECT g_idx, goods_name , to_char(goods_price,'999,999,999,999,999') format, to_char(regidate, 'yyyy.mm.dd hh24:mi') format1 "
					+ ", p_code from sh_goods ";
				   query +=" WHERE goods_name" +" LIKE '%"+ name +"%' ";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int g_idx = rs.getInt("g_idx");
				String goods_name = rs.getString("goods_name");
				String goods_price = rs.getString("format");
				String p_code = rs.getString("p_code");
				String regidate = rs.getString("format1");
				
				System.out.println("No 상품명 상품가격 상품등록날짜 제품코드");
				System.out.printf("%s %s %s %s %s\n",
						g_idx, goods_name, goods_price, regidate, p_code);
				
				
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close(); // DB 자원반납
		}
	}
	public static void main(String[] args) {
		SelectShop aa = new SelectShop();
		aa.execute();
	}

}
