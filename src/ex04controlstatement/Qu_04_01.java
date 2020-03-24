package ex04controlstatement;

import java.io.IOException;

/*
제어문(조건문)
문제1] 
하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여
숫자라면 2의배수인지를 다시 판단하여서 2의배수인 경우에만 "2의 배수 입니다"라고 출력하여라. 
그 외에는 "2의 배수가 아닙니다" 라고 출력한다.
힌트] '0'의 아스키코드값은 48 입니다. 
(System.in.read()를 사용하세요)

 */
public class Qu_04_01 {
	public static void main(String[] args) throws IOException {
		System.out.print("하나의 문자를 입력하세요:");
		int word = System.in.read();
		if(word >= '0' && word <= '9' ) {
			if((word-'0') %2 ==0) {
				System.out.println("2의 배수 입니다.");
			}
			else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else
		System.out.println("입력한문자는 숫자가 아닙니다.");
	}//end of main

}//end of class
