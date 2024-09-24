package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Q4 extends Thread {
	static AtomicInteger at=new AtomicInteger(0);
	static int count=0;
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Incremented value is: "+ at.incrementAndGet());
	}

	public static void main(String[] args) {
		Q4 q1=new Q4();
		Q4 q2=new Q4();
		Q4 q3=new Q4();
		Q4 q4=new Q4();
		
		q1.start();
		q2.start();
		q3.start();
		q4.start();

	}

}


/*Q4: Write a program where multiple threads increment a shared counter 
 * using AtomicInteger and ensure that the increments are atomic.*/
 