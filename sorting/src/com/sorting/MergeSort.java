package com.sorting;


// there are 2 methods to do merge sort--1) 2 ta sorted array combine kore ekta sorted array te banano
                                        //2) devide r conquer follow koreo kora jay jodi ekta array deya thake
//merge sort is a divide and conquer algorithm.
// merge sort a 2 ta alada sorted array theke combine kore ekta sorted array banaite hoy

	// 1. divide and conquer recursively breaks down a problem into two or more sub-
	// problems of the same of related type, until these become simple enough to be
	// solved directly. the solutions to the sub problems are thencombined to give a
	// solution to the origianl problem.
	// 2. divide-- in this step, the algorithm takes middle point of array and
	// divides
	// the array into 2 halves. the algorithm is carried out recursively for half
	// arrays, until there are no more half arrays to divide
	// 3. conquer--- in this step starting from the bottom, we sort and merge the
	// divided arrays and get the sorted array
	// ------asole bepar ta hocche za-- array ta multiple vage vaag hoy 2 ta 2ta element
	// kore erpor 2 ta 2 ta kore sorted hoye shob gula abar eksathe ekta sorted
	// array te add hoy ..etai merge sort
public class MergeSort {
	public int[] algorithmMergeSort(int a[],int []b, int m, int n ){// using method of 2 sorted arrays
		int result []= new int[m+n];                                                          // m and n hocche 2 ta array er elements
	int i=0; int j = 0; int k = 0;
	
	while(i<=m && j<=n) {
		if(a[i]<b[j]) {
			result[k]=a[i];
			i++;
		}
		else {
			result[k]=b[j];
			j++;
		}
		k++;
	}
	for(; i<m; i++) { // i jekhane thaima abr suru hoise
		result[k]=a[i];	
		k++;
	}
	for(;j<n;j++) { // j zekhane thaima abar suru hoise
		result[k]=b[j];
		k++;
	}
	return result;
	}
	
	public void printArray(int []a){
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
	void algorithmMergeSort(int low,int  high) { // devide and conquer method
		if(low< high) {
			int mid= (low + high) / 2;
			algorithmMergeSort(low, mid);
			algorithmMergeSort(mid+1, high);
			merge(low, mid, high);
			
		}
		
	}
	
	private void merge(int low, int mid, int high) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		MergeSort mg= new MergeSort();
		int array1[]= {5,15,25,35};
		int array2[]= {10,20,30,40};
		mg.printArray(array1);
		mg.printArray(array2);
		int [] result=mg.algorithmMergeSort(array1, array2, array1.length,array2.length );
		mg.printArray(result);
	}
	}
	
