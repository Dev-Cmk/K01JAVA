package quiz_game;

import java.util.Scanner;

public class Selection_Sort {

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

	void ascArr(int[] arr1) {
		int temp1;
		int minIndex = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			minIndex = i;
			for (int j = i; j <= arr1.length - 1; j++) {
				if (arr1[minIndex] < arr1[j]) {
					minIndex = minIndex;
				} else if (arr1[minIndex] > arr1[j]) {
					minIndex = j;
				}
			}
			temp1 = arr1[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp1;
			i++;
			System.out.println("Sort" + i + "번진행 : ");
			showArr(arr1);
			i--;
		}
	}

	void descArr(int[] arr2) {
		int temp2;
		int maxIndex = 0;
		for (int i = 0; i < arr2.length - 1; i++) {
			maxIndex = i;
			for (int j = i; j <= arr2.length - 1; j++) {
				if (arr[maxIndex] < arr[j]) {
					maxIndex = j;
				} else if (arr[maxIndex] > arr[j]) {
					maxIndex = maxIndex;
				}
			}
			temp2 = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp2;
			i++;
			System.out.println("Sort" + i + "번진행 : ");
			showArr(arr);
			i--;
		}
	}

	void select_sort_Start() {
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
		Selection_Sort aa = new Selection_Sort();
		aa.select_sort_Start();
	}
}