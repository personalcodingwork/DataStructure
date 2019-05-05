package org.graph.algorithm;
import java.util.List;
import java.util.Stack;

import org.graph.dfs.model.Vertex;
public class DFS {
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(List<Vertex> vertexList) {
		
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}

	private void dfsWithStack(Vertex root) {
		 root.setVisited(true);
		 stack.push(root);
		 
		 while(!stack.isEmpty()) {
			 Vertex actualVertex = stack.pop();
			 System.out.print(" "+actualVertex);
			 for(Vertex v : actualVertex.getNeighbourList()) {
				 v.setVisited(true);
				 stack.push(v);
			 }
		 }
	}
}
