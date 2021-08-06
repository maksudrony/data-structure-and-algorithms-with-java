package com.sortedMatrix;
// find the given key in the sorted matrix
public class SortedMatrix {
	
		 public void matrixSearch(int [][]matrix, int n, int key) {
			 int i=0;
			 int j=n-1;
			 while(i<n && j>=0) {
				 if(matrix[i][j]==key) {
					 System.out.println("key found at "+ i +", "+j);
					 return;
				 }
				 if(matrix[i][j]>key) {
					 j--;
				 }
				 else {
					 i++;
				 }
			 }
			 System.out.println("key not found");
		 }
		
		
		 public static void main(String[] args) {
		SortedMatrix sm = new SortedMatrix();
		int[][] matrix = { { 5, 10, 15, 20 },
				{ 25, 30, 35, 40 },
				{ 45, 50, 55, 60 },
				{ 65, 70, 75, 80 }

		};
		sm.matrixSearch(matrix, matrix.length, 30);
		sm.matrixSearch(matrix, matrix.length, 80);
		sm.matrixSearch(matrix, matrix.length, 100);
		
	}
}
