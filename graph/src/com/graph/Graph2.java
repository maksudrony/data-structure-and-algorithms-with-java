package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {// Graph for Adjacency List
	private LinkedList<Integer> [] adj;
	private int V; // number of vertices
	private int E; // number of edges
	
	public Graph2(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		Graph2 g = new Graph2(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		
		System.out.println(g);
		
	}
}
