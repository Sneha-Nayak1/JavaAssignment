package concurrency;

import java.util.concurrent.Semaphore;

public class Q8 {
	static Semaphore readLock=new Semaphore(3);
	static Semaphore writeLock = new Semaphore(1);
	static int readCount=0;
	
	static class Reads implements Runnable{

		@Override
		public void run() {
			try {
				readLock.acquire();
				readCount++;
				if(readCount==1) {
					writeLock.acquire();
				}
				readLock.release();
				
				System.out.println(Thread.currentThread().getName()+" has started reading");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" has finished reading");
				
				readLock.acquire();
				readCount--;
				if(readCount==0) {
					writeLock.release();
				}
				readLock.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static class Writes implements Runnable{

		@Override
		public void run() {
			try {
				writeLock.acquire();
				System.out.println(Thread.currentThread().getName()+" has started writing");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" has finished writing");
				writeLock.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) { 
		Reads r= new Reads();
		Writes w = new Writes();
		
		Thread t1=new Thread(r);
		t1.setName("Thread-1");
		Thread t2=new Thread(w);
		t2.setName("Thread-2");
		Thread t3=new Thread(r);
		t3.setName("Thread-3");
		Thread t4=new Thread(r);
		t4.setName("Thread-4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
		
	}

}


/*Q8: Solve the readers-writers problem where multiple readers can access 
 *a shared resource simultaneously, but only one writer can access it at a time.*/
