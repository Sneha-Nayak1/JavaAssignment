
package concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Q5 {
	static Thread t1;
	static Thread t2;
	
	public  static void detectDeadLock() {
		ThreadMXBean mxbean=ManagementFactory.getThreadMXBean();
		long[] arr= mxbean.findDeadlockedThreads();
		
		if(arr!=null) {
			System.out.println("Deadlock detected");
			
			for(long id:arr) {
				ThreadInfo info=mxbean.getThreadInfo(id);
				System.out.println(info.getThreadName()+ " is deadlocked");
				
			}
		
			
			if (t1.isAlive()) {
               // System.out.println("Interrupting thread " + t1.getName());
                t1.interrupt();
            }
            if (t2.isAlive()) {
                t2.interrupt();
			
			
		}
		}else {
			System.out.println("No deadlock detected");
		}
		
	}

	public static void main(String[] args) {
		String s1="Sneha";
		String s2="Nayak";
		
		 t1=new Thread(){
			public void run() {
			
					synchronized(s1) {
						System.out.println(Thread.currentThread().getName()+" has locked "+s1);
						synchronized(s2) {
							System.out.println(Thread.currentThread().getName()+" has locked "+s2);
						}
				
			}
			}
		};

		
		 t2=new Thread(){
			public void run() {
				
					synchronized(s2) {
						System.out.println(Thread.currentThread().getName()+" has locked "+s2);
						synchronized(s1) {
							System.out.println(Thread.currentThread().getName()+" has locked "+s1);
						}
					}
				
			}
		};
		
		t1.start();
		t2.start();
		detectDeadLock();
		if(t1.isAlive()) {
			t1.interrupt();
		}
		
		if(t2.isAlive()) {
			t2.interrupt();
		}
		
		System.out.println("Program Terminated!!");
		}
	
	
		
		

}


/*Q5: Create a scenario that can lead to a deadlock. 
* Write a program that detects the deadlock and resolves it programmatically.*/

