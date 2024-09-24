package multithreading;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread a=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Thread 1: "+ i);
				}
			}
		};
		
		Thread b=new Thread() {
			public void run() {
				for(int i=6;i<=10;i++) {
					System.out.println("Thread 2: "+ i);
				}
			}
		};
		
		a.start();
		
		try {
			a.join();
		}
		catch(InterruptedException e) {
			
		}
		b.start();
		try {
			b.join();
		}
		catch(InterruptedException e) {
			
		}

	}

}
/*Write a program of Thread, so thread1 should print 1 to 5 and 
 * thread2 should print 6 to 10?*/
 