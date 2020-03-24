package ex05method;

import java.util.Scanner;

/*
문제5-3]
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
  화씨 = 1.8 * 섭씨 + 32
  섭씨 = (화씨 - 32) / 1.8
 */

public class QuTemperature {
	
	//섭씨 -> 화씨
	static double celsius_To_Fahrenheit(double celsius) {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}//end of celsius_To_Fahrenheit
	
	//화씨 -> 섭씨
	static double fahrenheit_To_Celsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}//end of fahrenheit_To_Celsius
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨입력:");
		double num1 = sc.nextDouble();
		double num2 = celsius_To_Fahrenheit(num1);
		System.out.printf("섭씨를 화씨로 변환한 값: %.2f \n", num2);
		
		System.out.print("화씨입력:");
		double num3 = sc.nextDouble();
		double num4 = fahrenheit_To_Celsius(num3);
		System.out.printf("화씨를 섭씨로 변환한 값: %.2f",num4);
		
	}//end of main

}// end of class

