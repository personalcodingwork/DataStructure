package org.graph.bfs.driver;

import org.graph.bfs.algorithm.BFS;
import org.graph.model.Vertex;

public class Driver {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		
		v1.addNeighbourList(v2);
		v1.addNeighbourList(v3);
		v1.addNeighbourList(v4);
		
		v2.addNeighbourList(v5);
		v2.addNeighbourList(v6);
		
		v3.addNeighbourList(v7);
		
		BFS bfs = new BFS();
		bfs.bfs(v1);
		
	}

}
