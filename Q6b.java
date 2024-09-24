package multithreading;

class Utility{
	int i;
	boolean produced=false;
	public synchronized void set(int i) throws InterruptedException {
		while(produced) {
			wait();
		}
		this.i=i;
		produced=true;
		System.out.println("Produced -> "+i);
		notify();
	}
	
public synchronized void get() throws InterruptedException {
	while(!produced) {
		wait();
	}
	produced=false;
	System.out.println("Consumed -> "+i);
	notify();
	}
}

class Producer1 implements Runnable{
	Utility utility;
	public Producer1(Utility utility){
		this.utility=utility;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				utility.set(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer1 implements Runnable{
	Utility utility;
public Consumer1(Utility utility){
		this.utility=utility;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				utility.get();
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Q6b {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Producer1 prod=new Producer1(utility);
		Consumer1 cons=new Consumer1(utility);
		

	}

}

/*Write a program for InterThread communication(Producer-Consumer)
 *  with wait() and notify()*/
 