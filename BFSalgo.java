package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSalgo {
	
	 LinkedList<Integer> adj[];
	
	BFSalgo(int v){
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public  void insertEdge(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
//		System.out.println(adj[d]);
//		System.out.println(adj[s]);
	}
	
	public  void bfsTraversal(int start) {
		boolean visited[]=new boolean[adj.length];
		int parent[]=new int[adj.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(start);
		visited[start]=true;
		parent[start]=-1;
		
		while(!q.isEmpty()) {
			int res=q.poll();
			System.out.println(res);
			for(int i:adj[res]) {
				if(visited[i]!=true) {
					visited[i]=true;
				q.add(i);
				parent[i]=res;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices and edges:");
		int v=sc.nextInt();
		int e=sc.nextInt();
		BFSalgo b=new BFSalgo(v);
		System.out.println("Enter edges: ");
		for(int i=0;i<e;i++) {
			int s=sc.nextInt();
			int d=sc.nextInt();
			b.insertEdge(s,d);
		}	
		System.out.println("Enter source node: ");
		int start=sc.nextInt();
	
		b.bfsTraversal(start);
	}

}


/*Q9: Write a Program to implement BFS(Breadth-First Search) for a graph*/