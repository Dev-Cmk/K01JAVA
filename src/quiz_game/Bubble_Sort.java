package quiz_game;

import java.util.Scanner;

public class Bubble_Sort {
	int arr[] = new int[10];

	int[] makeArr() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; // 1~100사이의랜덤숫자생성
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}

		}
		return arr;
	}

	void showArr(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	void ascArr(int arr1[]) {
		int temp1;
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp1 = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp1;
				}
			} // end of sub for
			System.out.println("Sort " + i + "번진행 : ");
			showArr(arr1);
		} // end of main for
	}// end of ascArr

	void descArr(int arr2[]) {
		int temp2;
		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = 9; j > 0; j--) {
				if (arr2[j] > arr2[j - 1]) {
					temp2 = arr2[j];
					arr2[j] = arr2[j - 1];
					arr2[j - 1] = temp2;
				}
			}
			System.out.println("Sort " + i + "번진행 : ");
			showArr(arr2);
		}
	}

	void bubble_sort_Start() {
		int arr1[];
		arr1 = makeArr();
		System.out.print("배열보기 : ");
		showArr(arr1);

		System.out.println("정렬방식을 선택하세요 \n 1.오름차순 \n 2.내림차순");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			ascArr(arr1);
			break;
		case 2:
			descArr(arr1);
		}
	}

	public static void main(String[] args) {
		Bubble_Sort aa = new Bubble_Sort();
		aa.bubble_sort_Start();
	}

}
