package com.sorting;

public class InsertionSort {// array k 2 ta part a vaag kore ekta sorted array arekta unsorted array te
							// calculation kora lagbe
	public void printArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void sort(int[] array) {
		int n = array.length;

		for (int i = 1; i < n; i++) { // unsorted part
			int temp = array[i];
			int j = i - 1; // sorted part

			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j]; // shifting larger elements to temp by 1 pos
				j = j - 1;
			}
			array[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 2, 1, 5, 9 };
		InsertionSort is = new InsertionSort();
		is.printArray(a);
		is.sort(a);
		is.printArray(a);
	}

}
