package dataStructure;

class Node4{
	int data;
	Node4 left,right;
	Node4(int data){
		this.data=data;
		left=right=null;
	}
}

class Res{
	int value;
}

public class Q7 {
	Node4 root;
	
	int findMaxUtil(Node4 node, Res r) {
		
		if(node==null) {
			return 0;
		}
		
		int lef=findMaxUtil(node.left, r);
		int rig=findMaxUtil(node.right,r);
		
		int single=Math.max(Math.max(lef, rig)+node.data,  node.data);
		
		int top=Math.max(single,  lef+rig+node.data);
		
		r.value=Math.max(r.value,top);
		return single;
	}
	
	int findMaxSum(Node4 n) {
		Res res=new Res();
		res.value=Integer.MIN_VALUE;
		
		findMaxUtil(n, res);
		return res.value;
	}
	
	int findMaxSum() {
		return findMaxSum(root);
	}

	public static void main(String[] args) {
		Q7 q=new Q7();
		q.root=new Node4(10);
		q.root.left=new Node4(2);
		q.root.left.left=new Node4(20);
		q.root.left.right=new Node4(1);
		q.root.right=new Node4(10);
		q.root.right.right=new Node4(-25);
		q.root.right.right.right=new Node4(4);
		q.root.right.right.left=new Node4(3);
		
		System.out.println("Maximum path sum is: " + q.findMaxSum());
	}

}


/*Q7: Write a program to find the maximum path sum from given a binary tree.*/