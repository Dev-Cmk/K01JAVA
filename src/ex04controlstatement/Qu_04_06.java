package ex04controlstatement;

/*
제어문(반복문)
문제1] 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java
출력]
	*
	* *
	* * *
	* * * *
	* * * * *
 */
public class Qu_04_06 {

	public static void main(String[] args) {
		int x=1;
		int y;
		while(x<=5) {
			y=1;
			//j는 i의 갯수만큼 출력한다.
			while(y<=x) {
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}
		
	}//end of main

}//end of class
