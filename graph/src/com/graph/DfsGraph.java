package com.graph;
import java.util.LinkedList;
import java.util.Stack;

public class DfsGraph { // BFS for adjacency List Graph
						// stack diye kore, push r pop kaj kore
	                     // pre order traversal
	// in DFS, once we started exploring, once we visited a new vertex, we will
	// suspend the previous vertex and we will start exploring the new vertex

	private LinkedList<Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges

	public DfsGraph(int nodes) {
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

	public void dfs(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);

		while (!stack.isEmpty()) {
			int u = stack.pop();
			if (!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");

				for (int v : adj[u]) {
					if (!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		DfsGraph g = new DfsGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.dfs(0);
		System.out.println();
		System.out.println(g);

	}
}
