package collections1;

public class ArrayListAssign {
	static int size;
	static int i;
	int arr[];
	
	public ArrayListAssign(int size){
		this.size=size;
		this.i=0;
		this.arr=new int[size];
	}
	
	public void resize() {
		size=size*2;
		int arr2[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void add(int num) {
		if(i==size) {
			resize();
		}
		arr[i++]=num;
	}
	
	public void add(int index, int num) {
		if(i==size) {
			resize();
		}
		for(int i=size-2;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		arr[index]=num;
		i++;
	}
	
	
	public int indexof(int num) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(int num) {
		int j=indexof(num);
		if(j==-1)
			return false;
		else
			return true;
	}
	
	public void addAll(int one[]) {
		for(int i=0;i<one.length;i++) {
			add(one[i]);
		}
		display();
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssign list=new ArrayListAssign(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.display();
		System.out.println(list.indexof(3));
		list.add(1,6);
		list.display();
		System.out.println(list.contains(8));
		System.out.println(list.contains(3));
		list.display();
		int one[]= {10,11,12};
		list.addAll(one);
		

	}

}

//Q3: Implement your own ArrayList  using plain array? 
//supported Add(), indexof(), contains() also implement Addall() method
//in your own ArrayList ? 
//Write a method  to support add(int index, int value) ? 


