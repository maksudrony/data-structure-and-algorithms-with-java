package circularSinglyLinkedList;

import java.util.NoSuchElementException;

//import com.singlyLinkList.Node;

public class circularSinglyLinkedList {
 private Node last;
 private int length;
 public static void main(String[] args) {
	circularSinglyLinkedList cl= new circularSinglyLinkedList();
	cl.createCircularLinkedList();
	cl.insertFirst(50);
	cl.insertFirst(60);
	cl.insertLast(90);
	cl.removeFirst();
	cl.print();
	//System.out.println(cl.length());
}
 
 public circularSinglyLinkedList() {
	 last=null;
	 this.length=0;
 }
 public int length() {
	 
	 return length;
	 
 }
 public boolean isEmpty() {
	 return length==0;
 }
 public void createCircularLinkedList() {
	 Node first= new Node(1);
	 Node second= new Node(2);
	 Node third= new Node(3);
	 Node fourth= new Node(4);
	 Node fifth= new Node(5);
	 first.next=second;
	 second.next=third;
	 third.next=fourth;
	 fourth.next=fifth;
	 fifth.next=first;
	 
	 last = fifth;
 }
 public void print() {
		if(last == null) {
			return;
		}
		Node n = last.next;
		while(n != last) {
			System.out.print(n.element + " --> ");
			n = n.next;
			//length++;
		}
		System.out.println(n.element);
		
	}
 public void insertFirst(int value) {
		Node temp = new Node(value);
		if(last == null) {
			last = temp;
		} else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
 public void insertLast(int value) {
		Node temp = new Node(value);
		if(last == null) {
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
 public Node removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException("Circular Singly Linked List is already empty");
		}

		Node temp = last.next;
		if(last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}
 
 
}
