package ex04controlstatement;
public class Qu_04_08 {
	/*
	문제3]
	다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
	출력]	
	* * * * *
	* * * *
	* * *
	* *
	*
	 */

	public static void main(String[] args) {
		int x,y;
		for(x=1 ; x<=5; x++) {
			for(y=5 ; y>=x; y--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}//end of main

}//end of class
