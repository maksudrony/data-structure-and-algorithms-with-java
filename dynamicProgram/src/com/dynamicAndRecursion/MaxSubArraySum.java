package com.dynamicAndRecursion;
//using kadens algorithm find the maximum sum sub array 
public class MaxSubArraySum {
	 public static int maxSubArraySum(int []a){
	        int currentMax = a[0];
	        int maxSoFar = a[0];
	        for(int i = 1; i < a.length; i++){
	            currentMax = currentMax + a[i]; // Q1 - element becomes part of current subarray
	            if(currentMax < a[i]){
	                currentMax = a[i]; // Q2 - element decides to start its own subarray
	            }
	            if(maxSoFar < currentMax){
	                maxSoFar = currentMax;
	            }
	        }
	        return maxSoFar;
	    }

	    public static void main(String[] args) {
	        int[] array = {4, 3, -2, 6, -12, 7, -1, 6};
	        System.out.println(maxSubArraySum(array));
	    }
}
