package com.dynamicAndRecursion;

public class TopDownApproach {//1. its also called memorization
	//2. we break big problem to small sub problems`
	//3. each sub problems are solved and solutions are remembered
	//4. if the sub problems are solved already then reuse the answer
	//5. it memorizes the solutions of the sub  problems to avoid recomputing the value if sub
	// problem is encountered again
	public int fib(int memo[], int n) {//0 to 6
		if(memo[n]==0) {
			if(n<2) { // for 0 and 1
				memo[n]=n;
			}
			else {
				int left= fib(memo, n-1);
				int right= fib(memo, n-2);
				memo[n]= left+ right;
			}
			
		}
		return memo[n];
		
	}
public static void main(String[] args) {
	TopDownApproach td= new TopDownApproach();
	System.out.println(td.fib(new int[7+1], 7));// array te 1 jog korte hbe cz index 0 hocche 0
}
}
