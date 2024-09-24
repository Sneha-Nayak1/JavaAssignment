package concurrency;

import java.util.concurrent.Semaphore;

class SemaphoreThread extends Thread{
	Semaphore s;
	SemaphoreThread(Semaphore s){
		this.s=s;
	}
	public void run() {
		try {
			s.acquire();
			System.out.println(Thread.currentThread().getName()+" acquired the permit.");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" will release the permit.");
		s.release();
		
	}
}

public class Q6 {

	public static void main(String[] args) {
		Semaphore s=new Semaphore(1);
		SemaphoreThread s1=new SemaphoreThread(s);
		SemaphoreThread s2=new SemaphoreThread(s);
		SemaphoreThread s3=new SemaphoreThread(s);
		SemaphoreThread s4=new SemaphoreThread(s);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		try {
			s1.join();
			s2.join();
			s3.join();
			s4.join();
		}catch(InterruptedException e) {
			
		}
		
		
		

	}

}
/*Q6: Solve a problem using semaphores, for example, implement a 
 * scenario where a certain number of threads can concurrently access a resource.*/


 