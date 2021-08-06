package com.binaryTree;

public class BinarySearchTree {
private Node root;
	
	private class Node {
		private int data; // Generic type
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public Node insert(Node root, int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;


	}
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	public Node search(int key) {
		return search(root, key);
	}
	
	public Node search(Node root, int key) {
		if(root == null || root.data == key) { // base case 
			return root;
		}
		
		if(key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
		
	}
	public static void main(String[] args) {
		BinarySearchTree bs = new BinarySearchTree();
		bs.insert(5);
		bs.insert(3);
		bs.insert(7);
		bs.insert(1);
	
		bs.inOrder();
		
		System.out.println();
		
		if(null != bs.search(5)) {
			System.out.println("Key found !!!");
		} else {
			System.out.println("Key not found !!!");
		}
	}
	
}
