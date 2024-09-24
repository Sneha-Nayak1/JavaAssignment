package dataStructure;

class Node1{
	int data;
	Node1 next;
	
	public Node1(int data) {
		this.data=data;
		this.next=null;
	}
}

public class LinkedList1 {
	Node1 head;
	public LinkedList1() {
		this.head=null;
	}
	
	public void add(int data) {
		Node1 n=new Node1(data);
		if(head==null) {
			head=n;
		}else {
			Node1 cur=head;
			while(cur.next!=null) {
				cur=cur.next;
				
			}
			cur.next=n;
		}
		 
	}
	
	public void addFirst(int data) {
		Node1 n=new Node1(data);
		n.next=head;
		head=n;
	}
	
	public void addPosition(int data, int pos) {
		Node1 n=new Node1(data);
		if(pos==0) {
			addFirst(data);
		}
		Node1 cur=head;
		for(int i=0;i<pos-1;i++) {
			cur=cur.next;
		}
		n.next=cur.next;
		cur.next=n;
	}
	
	public boolean remove(int data) {

		if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            return true;
        }

        Node1 cur=head;
        while(cur.next!=null && cur.next.data!=data) {
        	cur=cur.next;
        }
        if(cur.next!=null) {
        	cur.next=cur.next.next;
        	return true;
        }
        return false;
		
	}
	
	
	public boolean removePos(int pos) {
		if(head==null) {
			return false;
		}
		if(pos==0) {
			head=head.next;
			return true;
		}
		Node1 cur=head;
		for(int i=0;i<pos-1;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return true;
	}
	
public void printList() {
	System.out.println("The list is as follow:");
	Node1 cur=head;
	while(cur!=null) {
		System.out.print(cur.data+"\t");
		cur=cur.next;
		
	}
	System.out.println();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList1 list=new LinkedList1();
		//System.out.println("vhh");
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 list.printList();
		 
		 System.out.println("Adding first to list:");
		 list.addFirst(10);
		 list.printList();
		 
		 System.out.println("Adding to list at given poistion:");
		 list.addPosition(15,2);
		 list.printList();
		 
		 System.out.println("Removing from list:");
		 list.remove(2);
		 list.printList();
		 
		 System.out.println("REmoving from list at given position:");
		 list.removePos(2);
		 list.printList();
		 
		

	}

}

//Q3: Write your own Linked List? Add and Remove method mainly?


