package com.singlyLinkList;

public class SinglyLinkedList {
	protected Node head;

	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();

		sl.head = new Node(10);
		Node second = new Node(15);
		Node third = new Node(20);
		Node fourth = new Node(25); // connecting with chain
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		sl.insert(11);
		sl.insertinto(90, 3);
		sl.insertLast(40);
		sl.insertLast(50);
		sl.insertLast(60);
		// sl.deletefirst();
		// sl.deletefirst();
		// sl.deletelast();
		// sl.deleteindex(3);

		System.out.println(sl.searchElement(70));
		sl.print();
		// sl.searchElement(50);

		sl.length();

		System.out.println("the length is ---> " + sl.length());
	}

	// printing linkedlist
	public void print() {
		for (Node c = head; c != null; c = c.next) {
			System.out.print(c.element + "---->");

		}
		System.out.println("null");
		System.out.println();
	}

	// length
	public int length() {
		int count = 0;
		for (Node n = head; n != null; n = n.next) {
			count++;
		}
		return count;
	}

	// insert a node at the beg
	public void insert(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void insertLast(int value) {
		Node newLastNode = new Node(value);
		if (head == null) {
			head = newLastNode;
			return;
		} else {
			Node n = head;
			while (null != n.next) {
				n = n.next;
			}
			n.next = newLastNode;
		}
	}

	// ----1----2------3-----4
	// insert into index no 2nd 3rd or 4th
	public void insertinto(int value, int index) {
		Node newNode = new Node(value);
		if (index == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			Node prev = head;
			int count = 1;
			while (count < index - 1) {
				prev = prev.next;
				count++;

			}
			Node current = prev.next;
			prev.next = current;
			newNode.next = current;
		}

	}

	// delete first Node
	public Node deletefirst() {
		if (head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;

	}

	// delete last node
	public Node deletelast() {
		if (head == null || head.next == null)
			return head;
		else {
			Node current = head;
			Node previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;

			}
			previous.next = null;
			return current;
		}
	}

	// delete index 3
	public void deleteindex(int index) {
		if (index == 1)
			head = head.next;
		else {
			int count = 1;
			Node previous = head;

			while (count < index - 1) {

				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;

		}

	}

	// search element
	public boolean searchElement(int searchkey) {
		for (Node n = head; n != null; n = n.next) {
			if (n.element == searchkey) {
				return true;
			}

		}
		return false;

	}
    //reverse singly linked list
	public Node reverse() {
		Node prev=null;
		Node next=null;
		for(Node current= head;current!=null; current=current.next) {
			next= current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		return prev;
	}

	
	
	
	
	
	
}
