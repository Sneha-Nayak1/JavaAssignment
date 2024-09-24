package multithreading;

class Simple extends Thread{
	static int count=0;
	
	public synchronized void run() {
		count++;
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		Simple s=new Simple();
		Thread t1=new Thread(s,"T1");
		Thread t2=new Thread(s,"T2");
		Thread t3=new Thread(s,"T3");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("Total count is: "+Simple.count);

	}

}
/* Write a program to count , how many times a method was accessed by threads,
 *  in a multi-thread environment.*/
 
