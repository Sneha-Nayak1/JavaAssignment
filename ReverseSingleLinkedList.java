package dataStructure;

 class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

public class ReverseSingleLinkedList {
	 Node head;

public void display() {
	Node n=head;
		while(n!=null) {
			System.out.print(n.data+"\t");
			n=n.next;
	}
		System.out.println();
}

public void reverse() {
	Node current=head;
	Node previous=null;
	Node next=null;
	
	while(current!=null) {
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		
	}
	head=previous;

	
}

	public static void main(String[] args) {
		ReverseSingleLinkedList sl=new ReverseSingleLinkedList();
	sl.head=new Node(1);
		Node two=new Node(2);
		sl.head.next=two;
		Node three=new Node(3);
		two.next=three;
		Node four=new Node(4);
		three.next=four;
		sl.display();
		
		sl.reverse();
		sl.display();
		
	}

}


//Q5: Write a program to Reverse a singly linked list.

