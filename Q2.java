package concurrency;

public class Q2 extends Thread{
	 Object lock=new Object();
	
	public static synchronized void classLevel(){
		System.out.println("Class level --> "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
	
	public void objectLevel() {
		synchronized(lock) {
			System.out.println("Object Level --> "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
		
	}
	
	public void run() {
		objectLevel();
		classLevel();
	}

	public static void main(String[] args) {
		Q2 q1=new Q2();
		q1.start();
		Q2 q2=new Q2();
		q2.start();
	}
}
/*Q2: Write a program for class level locking and object level locking*/


