package com.dynamicAndRecursion;

//DYNAMIC PROGRAMMING WITH RECURSION
// though iterative solutions are better for simple and complex algorithms.
public class Fibonacci {// 1. its mainly optimized over recursion
						// 2. Dynamic program= recursion + memorization
						// 3. in the memorizetion part, the dynamic program memorize the solutions and
						// it stores it somewhere so, when the subproblems again comes into picture then
						// it usually use the store solutions rather than recalculating again and again.

	
	public int fib(int n) { // fib(n)= fib(n-1)+ fib(n-2)
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		int left= fib(n-1);
		int right= fib(n-2);
		int result= left+ right;
		return result;
		
	}
	
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		System.out.println(fb.fib(5));
	}
}
