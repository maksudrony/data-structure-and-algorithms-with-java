package com.sorting;

public class SelectionSort {// selection sort a unsorted r sorted dui ta part a vaag kore, left valuer sathe
							// compare kore swap chalaya leftmost a ekta ekta value save hoite thake
	public void printArray(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] a ={ 5, 1, 2, 9, 10 };
		
		ss.printArray(a);
		ss.sort(a);
		ss.printArray(a);
	}

}
