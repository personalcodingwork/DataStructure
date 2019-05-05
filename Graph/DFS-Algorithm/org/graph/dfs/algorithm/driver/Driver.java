package org.graph.dfs.algorithm.driver;

import java.util.ArrayList;
import java.util.List;

import org.graph.algorithm.DFS;
import org.graph.dfs.model.Vertex;

public class Driver {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		Vertex G = new Vertex("G");
		Vertex H = new Vertex("H");
		
		A.addNeighbour(B);
		A.addNeighbour(F);
		A.addNeighbour(G);
		
		B.addNeighbour(C);
		B.addNeighbour(D);
		
		G.addNeighbour(H);
		
		D.addNeighbour(E);
		
		List<Vertex> listOfGraph = new ArrayList<Vertex>();
		listOfGraph.add(A);
		
		dfs.dfs(listOfGraph);

	}

}
