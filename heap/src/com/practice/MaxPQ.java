package com.practice;
//*** heap is fastest data structure to implement a priority queue cz time complexity is -- O(log n)
//create a heap from array (in max heap)--- 1)ekta ekta kore element heap tree te add korte hobe.
                                          //2) then sort korte hobe max heap onujayi level by level
                                          //3) time complixity -- O(n log n)
//heap theke element delete korte gele first elem ta soray binary tree er sesher elem ta first element hoye jabe
// time complixity for delete-- O(n log n)
//heapify--- 1) ekta complete binary tree r array thake
           //2) erpor oi binary tree k heap er moto create korte hoy niche theke or array er last element theke.
           //3) time complexity -- O(n)
// smaller number jodi higher priority thake tahole min heap korte hobe
// larger number jodi higher priority thake tahole max heap korte hbe
// priority queue te max or min heap er insertion er time complixity -- O(log n)
// priority queue te max or min heap er deletion er time complixity -- O(log n)
public class MaxPQ {
	//heap is complete binary tree
	//height of a binary tree is O(log n)
	//time complexity -- O(1) to O(log n)
	private int[] heap;
	private int n;// size of the max heap

	public MaxPQ(int capacity) {
		heap = new int[capacity + 1]; // capacityr sathe 1 add korsi coz index 0 hisab korbo na
		n = 0; // heap binary er khetre
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	// inserting values in heap binary tree
	public void insert(int x) {
		if (n == heap.length - 1) {
			resize(2 * heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
// swim operation in heap binary tree
	private void swim(int k) {
		while (k > 1 && heap[k / 2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k / 2];
			heap[k / 2] = temp;
			k = k / 2;// coz we need to continue shifting the elements till new value inserted in the
						// correct postion
		}
	}
//resize the heap into double
	private void resize(int capacity) {
		int[] temp = new int[capacity];
		for (int a = 0; a < heap.length; a++) {
			temp[a] = heap[a];
		}
		heap = temp;

	}
	//printing the max heap into the array
	public void printMaxHeap() {
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " -- ");
		}
	}

	public static void main(String[] args) {
		MaxPQ max = new MaxPQ(3);
		max.insert(12);
		max.insert(9);
		max.insert(8);
		max.insert(10);
		max.insert(2);
		System.out.println(max.isEmpty());
		System.out.println(max.size());
		max.printMaxHeap();

	}
}
