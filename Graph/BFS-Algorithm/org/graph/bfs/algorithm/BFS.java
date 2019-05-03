package org.graph.bfs.algorithm;

import java.util.LinkedList;
import java.util.Queue;

import org.graph.model.Vertex;

public class BFS {
	public void bfs(Vertex root) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		while(!queue.isEmpty()) {
			Vertex vertex = queue.remove();
			System.out.print(" "+vertex);
			for(Vertex v : vertex.getNeighbourList()) {
			if(!v.isVisited()) {
				v.setVisited(true);
				queue.add(v);
				}
			}
		}
	}
}
