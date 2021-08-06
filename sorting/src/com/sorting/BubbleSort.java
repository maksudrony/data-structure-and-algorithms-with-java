package com.sorting;

public class BubbleSort {
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void sort(int[] arr) {
		int n = arr.length;
		boolean isSwapped;// local variable like a, b or etc

		for (int i = 0; i < n - 1; i++) {
			isSwapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}

		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 9, 2, 1 };
		BubbleSort bs = new BubbleSort();
		bs.printArray(a);
		bs.sort(a);
		bs.printArray(a);

	}
}
