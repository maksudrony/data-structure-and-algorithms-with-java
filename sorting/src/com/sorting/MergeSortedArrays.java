package com.sorting;

public class MergeSortedArrays {// merging two sorted arrays
	   public int[] merge(int[] a1, int[] a2, int n, int m){
	        int[] result = new int[n + m];
	        int i = 0; // traverse arr1
	        int j = 0; // traverse arr2
	        int k = 0; // traverse result

	        while(i < n && j < m){ // boundary conditions
	            if(a1[i] < a2[j]){ // if arr1 element at i is less than arr2 element at j
	                result[k] = a1[i]; // storing arr1 element into result
	                i++;
	            } else {
	                result[k] = a2[j]; // storing arr2 element into result
	                j++;
	            }
	            k++;
	        }
	        // either arr1 got exhausted or arr2 got exhausted
	        while(i < n) { // arr2 got exhausted
	            result[k] = a1[i]; // storing arr1 element into result
	            i++;
	            k++;
	        }

	        while(j < m) { // arr1 got exhausted
	            result[k] = a2[j]; // storing arr2 element into result
	            j++;
	            k++;
	        }

	        return result;

	    }

	    public void printArray(int[] a) {
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        MergeSortedArrays ms = new MergeSortedArrays();
	        int[] array1 = {0, 1, 8, 10};
	        int[] array2 = {2, 4, 11, 15, 20};
	        ms.printArray(array1);
	        ms.printArray(array2);

	        int[] result = ms.merge(array1, array2, array1.length, array2.length);
	        ms.printArray(result);
	    }
    	
}
