package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// height of complete binary tree log n (minimum)
public class BinaryTree {
	private Node root;

	public class Node {
		private Node left;
		private Node right;
		private int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		Node sixth = new Node(60);
		Node seventh = new Node(70);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;

	}

// normal way te korsi
	public void preOrder() { // root--> left--> right
		preOrder(root);
	}

	public void preOrder(Node root) { // recursive way te
		if (root == null) {
			return;
		} else {

			System.out.print(root.data + " -- ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	// baaler data structure way

	public void preOrderInDataStructure(Node root) {
		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data + " -- ");
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
	}

// normal way
	public void inOrder() {// //left--> root--> right
		inOrder(root);
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		} else {

			inOrder(root.left);
			System.out.print(root.data + " -- ");
			inOrder(root.right);
		}

	}

//baaler data structure way
	public void inOrderInDataStructure(Node root) {
		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();
		Node temp = root;

		while (!stack.isEmpty() || temp != null) {
			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " -- ");
				temp = temp.right;
			}
		}
	}

// normal way te korsi
	/*
	 * public void postOrder() { // left--> right--> root postOrder(root); }
	 */
	public void postOrder(Node root) { // left--> right--> root
		if (root == null) {
			return;
		} else {

			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " -- ");
		}

	}

// baaler data structure way
	public void postOrderInDataStructure(Node root) {
		Node current = root;
		Stack<Node> stack = new Stack<>();

		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " -- ");
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " -- ");
					}
				} else {
					current = temp;
				}
			}
		}
	}

	// print the elements of the tree level by level
	public void levelOrder() {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>(); // linklist diye queue call korsi..etare queue data structure bole
												// zekhane ekta end dya Nodes dhukbe arekta end dya ber hobe
		queue.offer(root);// offer hocche enqueue operation, where we add the element into the queue

		while (!queue.isEmpty()) {
			Node temp = queue.poll();// The poll() method of Queue Interface returns and removes the element at the
										// front the container. It deletes the element in the container.
			System.out.print(temp.data + " -- ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
// find maximum value of the tree
	public int findMax() {
		return findMax(root);
	}

	public int findMax(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);

		if (left > result) {
			result = left;
		}

		if (right > result) {
			result = right;
		}

		return result;

	}

	public static void main(String[] args) {
		BinaryTree bn = new BinaryTree();
		bn.createBinaryTree();
		System.out.print("preOrder--               ");
		bn.preOrder();
		System.out.println();
		System.out.print("preOrderInDataStructure--");
		bn.preOrderInDataStructure(bn.root);
		System.out.println();
		System.out.print("inOrder--               ");
		bn.inOrder();
		System.out.println();
		System.out.print("inOrderInDataStructure--");
		bn.inOrderInDataStructure(bn.root);
		System.out.println();
		System.out.print("postOrder--               ");
		bn.postOrder(bn.root);
		System.out.println();
		System.out.print("postOrderIndataStructure--");
		bn.postOrderInDataStructure(bn.root);
		System.out.println();
		System.out.print("levelOrder--             ");
		bn.levelOrder();
		System.out.println();

		System.out.println("the maximum value is --  "+bn.findMax());
	}

}
