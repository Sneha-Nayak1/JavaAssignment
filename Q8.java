package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


class Store{
	ReentrantLock rt=new ReentrantLock();
	static int arr[]=new int[3];
	static int size=0;
	
	
	Condition c=rt.newCondition();
	
	public void produce(int i) throws InterruptedException {
		int index=0;
		rt.lock();
		try {
			if(size==arr.length) {
				c.await();
			}
			arr[index]=i;
			if(++index==arr.length) {
				index=0;
			}
			++size;
			c.signal();
		}
		finally {
			rt.unlock();
		}
	}
	
	public void consume() throws InterruptedException {
		int index=0;
		rt.lock();
		try {
			if(size==0) {
				c.await();
			}
			int item=arr[index];
			if(++index==arr.length) {
				index=0;
			}
			--size;
			c.signal();
			System.out.println("Consumed --> "+item);
		}
		finally {
			rt.unlock();
		}
	}
	
}

class Producer3 extends Thread{
	Store st;
	int i;
	
	Producer3(Store st,int i){
		this.st=st;
		this.i=i;
	}

	@Override
	public void run() {
		try {
			st.produce(i);
			System.out.println("Produced --> "+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Consumer3 extends Thread{
	Store st;
	Consumer3(Store st){
		this.st=st;
	}

	@Override
	public void run() {
		try {
			st.consume();
			//System.out.println("Consumed --> "+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Q8 {

	public static void main(String[] args) {
		Store st=new Store();
		
		for(int i=1;i<=3;i++) {
			new Producer3(st,i).start();
		}
		
		for(int i=1;i<=3;i++) {
			new Consumer3(st).start();
		}
//		Producer3 prod = new Producer3(st);
//		Consumer3 cons = new Consumer3(st);
		
	}

}
/*Implement a producer-consumer problem with multiple producers 
 * and consumers using ReentrantLock and Condition*/
 

