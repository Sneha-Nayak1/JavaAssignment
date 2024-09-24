package concurrency;

public class Q1 implements Runnable{
	 Object lock=new Object();
	
	public synchronized  void methodLevel() {
		System.out.println("Method level --> " +Thread.currentThread().getName());
	}
	
	public void objectLevel() {
		synchronized(lock) {
			System.out.println("Object Level --> "+Thread.currentThread().getName());
			System.out.println("Object Level --> "+Thread.currentThread().getName());
		}
		
	}
	
	public void run() {
		//methodLevel();
		objectLevel();
	}

	public static void main(String[] args) {
		
		Q1 q1=new Q1();
		Thread t1=new Thread(q1);
		Thread t2=new Thread(q1);
		
		Thread t3=new Thread(q1);
		Thread t4=new Thread(q1);
		
//		Q1 q2=new Q1();
//		Q1 q3=new Q1();
//		Q1 q4=new Q1();
//		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}


/*Write a program for Object level and method level synchronization.*/