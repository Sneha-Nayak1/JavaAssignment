package dataStructure;


class St{
	int data;
	St next;
	St(int data){
		this.data=data;
	}
}

public class Stack {
	St root;
	
	
	public void push(int data) {
		St node=new St(data);
		if(root==null) {
			root=node;
		}else {
			St temp=root;
			root=node;
			node.next=temp;
			
		}
		//System.out.println();
	}
	
	public int pop() {
		int popped=Integer.MIN_VALUE;
		if(root==null) {
			System.out.println("Stack is Empty!!");
		}
		else {
			popped=root.data;
			root=root.next;
		}
		return popped;
	}
	
	public void display() {
		St node;
		node=root;
		//System.out.println(.data);
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Elements in stack: ");
		s.display();
		System.out.println();
		s.pop();
		System.out.println("Elements after poping:");
		s.display();

	}

}
/* Implement own  Stacks and Queue with push() and pop() method*/


