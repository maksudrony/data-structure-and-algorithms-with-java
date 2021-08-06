package com.sorting;
// quick sort a pivot dhore devide r conquer dhore korte hoy. frst or last element ta k pivot dhore korte hoy
// TIME COMPLEXITY of quick sort is O(n log n)
public class QuickSort {
	static void swap(int[] arr, int i, int j){ //// A utility function to swap two elements
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	static int partition(int[] arr, int low, int high)
	{
	     
	    // pivot
	    int pivot = arr[high];
	     
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	         
	        // If current element is smaller
	        // than the pivot
	        if (arr[j] < pivot)
	        {
	             
	            // Increment index of
	            // smaller element
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	 
	/* The main function that implements QuickSort
	          arr[] --> Array to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	         
	        // pi is partitioning index, arr[p]
	        // is now at right place
	        int pi = partition(arr, low, high);
	 
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	 void printArray(int[] a){
		 int n= a.length;
	    for(int i = 0; i < n; i++)
	        System.out.print(a[i] + " ");
	         
	    System.out.println();
	}
	
	
	
public static void main(String[] args) {
	QuickSort qs= new QuickSort();
	 int[] array = { 10, 7, 8, 9, 1, 5 };
	    int n = array.length;
	     
	    quickSort(array, 0, n - 1);
	    System.out.println("quick sort is: ");
	    qs.printArray(array);
}
}
