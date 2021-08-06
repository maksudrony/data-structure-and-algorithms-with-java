package com.singlyLinkList;

public class Node {
	// public Object element;
	public Node head;
	public int element;
	public Node next;

	/*
	 * public Node(Object e, Node n) {
	 * 
	 * this.element=e; this.next=n; }
	 */
	public Node(int element) {
		this.element = element;
		this.next = null;
	}

}