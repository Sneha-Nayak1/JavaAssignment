package dataStructure;

class Queue1{
	int data;
	Queue1 next;
	public Queue1(int data) {
		this.data=data;
		this.next=null;
	}
}

public class QueueProgram {
	Queue1 front,rear;
	public QueueProgram(){
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		if(front==null && rear==null)
			return true;
		else
			return false;
	}
	
	public void enquque(int data) {
		Queue1 q=new Queue1(data);
		if(rear==null) {
			front=q;
			rear=q;
			return;
		}else{
			rear.next=q;
			rear=q;
		}
	}
	
	public void dequque() {
		if(isEmpty()) {
			System.out.println("Underflow..............");
			
		}else {
			Queue1 q=front;
			front=front.next;
		}
	}
	
	void display() {
		System.out.println("Elemts in the queue are:");
	Queue1 q=front;
	while(q!=null) {
		System.out.print(q.data+"\t");
		q=q.next;
	}
	System.out.println();
	}

	public static void main(String[] args) {
		QueueProgram q=new QueueProgram();
		q.enquque(10);
		q.enquque(20);
		q.enquque(30);
		q.enquque(40);
		q.display();
		q.dequque();
		q.display();
		

	}

}
