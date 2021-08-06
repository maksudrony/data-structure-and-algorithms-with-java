package com.dynamicAndRecursion;
// find the nth fibonacci number using Bottom up approach and recursion
public class BottomUpApproach {
//1.we try to solve smaller sub problems first, then use their solution to build on and arrive at
	// solutions to bigger sub problems
//2.its called as Tabulation method.
//3. we store the sub problem values in the table (array) then we reuse it for the bigger problem
	public int tableFib(int n) {
		int table[]= new int [n+1];
		 table[0]=0;
		 table[1]=1;
		 for(int i=2; i<=n; i++) {
			 table[i]=table[i-1]+table[i-2];
		 }
		return table[n];
		 
		
	}
public static void main(String[] args) {
	BottomUpApproach bt= new BottomUpApproach();
	System.out.println(bt.tableFib(6));
}
}
