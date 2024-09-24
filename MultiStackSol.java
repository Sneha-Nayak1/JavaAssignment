package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class MultiStackSol {
	static int size;
	int i;
	List<Integer> list;
	
	public MultiStackSol(int size) {
		this.size=size;
		this.i = 0;
		this.list = new ArrayList<>();
		
	}
	
	public void resize() {
		size=size*2;
		List<Integer> list2=new ArrayList<Integer>(size);
		list2.addAll(list);
		list=list2;
	}
	
	public void push(int ele) {
		if(list.size()==size) {
			resize();
		}
		list.add(ele);
	}
	
	public int pop() {
		if(list.isEmpty()) {
			System.out.println("Stack is empty");
		}
		return list.remove(list.size()-1);
	}
	
	public void display() {
		System.out.println("Elements in list are: ");
		System.out.println(list);
	}

	public static void main(String[] args) {
		MultiStackSol m=new MultiStackSol(3);
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.display();
		m.pop();
		m.display();

	}

}
/*Q6:Implements multistack solution for a fixed sized stack beyond 
 * which it should create a new stack.*/
