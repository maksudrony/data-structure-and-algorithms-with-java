package com.singlyLinkList;


public class SinglyLinkedListLoop {
	private Node head;
public static void main(String[] args) {
	SinglyLinkedListLoop sll= new SinglyLinkedListLoop();
	sll.createdSinglyLinkedListLoop();
	System.out.println(sll.containsLoop());
	System.out.println(sll.startNodeInALoop().element);
	sll.removeLoop();
	sll.display();
}


public void createdSinglyLinkedListLoop(){
	Node first=new Node(5);
	Node second=new Node(10);
	Node third=new Node(15);
	Node fourth=new Node(20);
	Node fifth=new Node(25);
	Node sixth=new Node(30);
	Node seventh=new Node(35);
	head=first;
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=sixth;
	sixth.next=seventh;
	seventh.next=fourth;
	
	//print();
	
}
public boolean containsLoop() {
	Node fastPos = head;
	Node slowPos = head;
	
	while(fastPos != null && fastPos.next != null) {
		fastPos = fastPos.next.next;
		slowPos = slowPos.next;
		
		if(fastPos == slowPos) {
			return true;
		}
	}
	return false;
}
public Node startNodeInALoop() {
	Node fastPos = head;
	Node slowPos = head;

	while(fastPos != null && fastPos.next != null) {
		fastPos = fastPos.next.next;
		slowPos = slowPos.next;

		if(fastPos == slowPos) {
			return getStartingNode(slowPos);
		}
	}
	return null;
}
private Node getStartingNode(Node slowPos) {
	Node temp = head;
	while(temp != slowPos){
		temp = temp.next;
		slowPos = slowPos.next;
	}
	return temp; // starting node of the loop
}

public void display() {

	for (Node n = head; n != null; n = n.next) {
		System.out.print(n.element + "---->");

	}
	System.out.print("null");
	System.out.println();
}
//remove a loop from singly linked list
	public void removeLoop() {
		Node fastPos=head;
		Node slowPos=head;
		while(fastPos!=null && fastPos.next!=null) {
			fastPos=fastPos.next.next;
			slowPos=slowPos.next;
			if(fastPos==slowPos)
			removeLoop(slowPos);
			//return;
		}
	}
	private void removeLoop(Node slowPos) {
		Node temp=head;
		while(temp.next!=slowPos.next) {
			temp=temp.next;
			slowPos=slowPos.next;
		}
		slowPos.next=null;
	} 
}
