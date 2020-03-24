package ex06array;

import java.util.Scanner;

/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2

 */
public class QuFillArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10]; //입력받은 정수를 순서대로 입력
		int[] arr2 = new int[10]; //홀수, 짝수 구분해서 입력
		System.out.print("10개의정수입력:");
		
		int indexEnd = arr2.length - 1; //arr2 배열의 마지막 인덱스 지정
		int indexStart = 0; //arr2 배열의 첫번째 인덱스 지정
		
		for(int i=0 ; i<arr1.length ; i++) {
			//첫번째 배열에는 입력한 순서대로 배열을 채운다.
			arr1[i] = sc.nextInt();
			
			//홀수,짝수를 구분하여 홀수이면 앞에서부터, 짝수면 뒤에서부터 배열채움
			//짝수이면 뒤에서부터 채우고, 인덱스 -1 감소
			if(arr1[i] % 2 == 0 ) {
				arr2[indexEnd--] = arr1[i];
			}
			else {
				//홀수이면 앞에서부터 채우고, 인덱스 +1 증가
				arr2[indexStart++] = arr1[i];
			}
		}
		System.out.print("순서대로입력된결과: ");
		for(int e : arr1) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		
		System.out.print("홀수/짝수 구분입력결과: ");
		for(int h : arr2) {
			System.out.print(h+" ");
		}
	}

}
