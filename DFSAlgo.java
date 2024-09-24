package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DFSAlgo {
	LinkedList<Integer> adj[];
	DFSAlgo(int v){
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
		
	}
	
	public void insertEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
		
	}
	
	public void dfsTraversal(int start) {
		boolean visited[]=new boolean[adj.length];
		int parent[]=new int[adj.length];
		Stack<Integer> st=new Stack<>();
		st.push(start);
		visited[start]=true;
		parent[start]=-1;
		while(!st.isEmpty()) {
			int res=st.pop();
			System.out.println(res);
			for(int i:adj[res]) {
				if(visited[i]!=true) {
					visited[i]=true;
				st.push(i);
				parent[i]=res;
				}
			}
		}

	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vertices and edges: ");
		int v=sc.nextInt();
		int e=sc.nextInt();
		DFSAlgo df=new DFSAlgo(v);
		System.out.println("Enter the edges:");
		for(int i=0;i<e;i++) {
			int s=sc.nextInt();
			int d=sc.nextInt();
			df.insertEdge(s,d);
		}
		System.out.println("Enter the start node: ");
		int start=sc.nextInt();
		df.dfsTraversal(start);
		

	}

}
