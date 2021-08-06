package com.doublyLinkList;

import java.util.NoSuchElementException;

public class DoublyLinkedlist{
	private Node head;
	private Node tail;
	private int length;
	public static void main(String[] args) {
		DoublyLinkedlist dll = new DoublyLinkedlist();
		dll.insertLast(1);
		dll.insertLast(2);
		dll.insertLast(3);
		dll.insertFirst(40);
		dll.deleteFirst();
		dll.deleteLast();
		dll.display();
		System.out.println("length is --->"+ dll.length());
	}
	//print the doubly linked list
	public void display() {
		for(Node n=head;n!=null; n=n.next ) {
			System.out.print(n.element+ "--->");
		}
		System.out.println();
	}
	
	public DoublyLinkedlist() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty() {
		
		return length==0; //head==null
	}
	// length
	public int length() {
		return length;
	}
	// insert elemnt at the beginning
	public void insertFirst(int value) {
	Node newNode = new Node(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	//insert element at the last
	public Node insertLast(int value) {
		Node newNode=new Node(value);
		if(isEmpty())
			head=newNode;
		else {
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
		return newNode;
		
	}
	//delete first Node
	public Node deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		Node temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	//delete last Node
	public Node deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		Node temp = tail;
		if(head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	
}
