package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class Q6a {
	static class Producer{
		BlockingQueue<Object> bq;
		Producer(BlockingQueue<Object> bq){
			this.bq=bq;
		}
		public void produce() {
			
					try{
						bq.put(new Object());
						System.out.println("Produced an item..");
					}catch(InterruptedException e) {
						
					}
					
		}
	}
	
	static class Consumer{
		BlockingQueue<Object> bq;
		Consumer(BlockingQueue<Object> bq){
			this.bq=bq;
		}
		public void consumer() {
			
					try {
						bq.take();
						System.out.println("Consumed an item...");
					}catch(InterruptedException e) {
						
						
			}
		}
	}

	 
	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Object> bq=new LinkedBlockingQueue<>(10);
	  
	   
	   Producer prod=new Producer(bq);
	   Consumer con=new Consumer(bq);
	   Runnable p=new Runnable() {

		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				   prod.produce();
			   }
			   System.out.println("Produced...");
			
		}
		   
	   };
	   Thread t1=new Thread(p);
	   
	   
	   Runnable c=new Runnable() {

		@Override
		public void run() {
				con.consumer();

			System.out.println("Consumed...");
			
		}
		   
	   };
	   Thread t2=new Thread(c);
	   t1.start();
	   t2.start();
	   t1.join();
	   t2.join();
	  // System.out.println(bq);
	   System.out.println("Current Size is: "+bq.size());
	   
	    
		

	}

}

/*Write a program for  InterThread communication(Producer-Consumer) 
 *  with LinkedBlockingQueue()*/


