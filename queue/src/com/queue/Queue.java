package com.queue;

import java.util.NoSuchElementException;

public class Queue {// showing queue with data structure
	private Node rear;
	private Node front;
	private int length;
	public class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public int length() {// return the length of the queue
		return length;
	}
	public boolean isEmpty() {// if the queue is empty
		return length==0;
	}
	public void enqueue(int data){ //enqueue means insert the element
		Node temp= new Node(data);
		if(isEmpty()) {
			front=temp;
		}
		else {
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	public int dequeue() { //dequeue means pop out the element
		if(isEmpty()) {
			throw new NoSuchElementException("the queue is empty");
		}
		int result= front.data;
		front=front.next;
	    if(front==null) {
	    	rear = null;
	    }
	    length--;
	    return result;
	}
	public void print() { // print the queue
		if(isEmpty()) {
			return;
		}
		else {
			for(Node n= front; n!=null; n=n.next) {
				System.out.print(n.data+ "-->");
			}
		}
			
	}
	
	
 public static void main(String[] args) {
	Queue que= new Queue();
	que.enqueue(30);
	que.enqueue(50);
	que.enqueue(70);
	que.dequeue();
	que.print();
}
}
