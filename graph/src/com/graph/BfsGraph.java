package com.graph;

import java.util.LinkedList;
import java.util.Queue;
//The time complexity of BFS using Adjacency list is O(V + E) where V & E are the vertices and
//edges of the graph respectively.

public class BfsGraph {// BFS for adjacency List Graph
						// level by level search kore
	                    // level order traversal
						// enqueue r dequeue operation kaj kore
	  //in BFS we explore the vertex then we go to the next vertex for exploration

	private LinkedList<Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges

	public BfsGraph(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for (int v = 0; v < V; v++) {
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
		for (int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for (int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public void bfs(int s) {
		boolean[] visited = new boolean[V]; // prothome array er moddhe visited element gula false thakbe ty boolean
											// dhora hoise.. false thakar karon hocche za node gula ekhono visit kora
											// hoy nay

		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);

		while (!q.isEmpty()) {
			int u = q.poll(); // nicher for loop tay visit hoye Node ta true howar por seta poll kore queue
								// theke ber kore ansi
			System.out.print(u + " ");

			for (int v : adj[u]) { // checked how many vertices connected with that vertex
									// iterate every element of the adjacency list
				if (!visited[v]) { // checked if the node has visited yet or not
					visited[v] = true;//
					q.offer(v);
				}
			}
		}
	}

	public static void main(String[] args) {
		BfsGraph g = new BfsGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.bfs(0);
		System.out.println();
		System.out.println(g);

	}
}
