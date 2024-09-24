package collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

class Cache1{
	int key;
	String value;
	
	public Cache1(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
}
public class LRUCache {
	
	 static LinkedList<Integer> list = new LinkedList<>();
	 LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
	int capacity=3;
	
	public String get(int key) {
		if(map.containsKey(key)) {
			String val = map.get(key);
			list.remove((Integer)key);
			list.addFirst(key);
			return val;
		}
		return "-1";
	}
	
	public void putElement(int key, String value) {
		if(map.containsKey(key)) {
			String val=map.get(key);
			list.remove(key);
		}else {
			if(list.size()==capacity) {
				int temp=list.removeLast();
				map.remove((Integer)temp);
			}
		
		
		Cache1 newone=new Cache1(key, value);
		list.addFirst(key);
		map.put(key, value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache l=new LRUCache();
		l.putElement(1, "Apple");
		l.putElement(2, "Cat");
		l.putElement(3, "Dog");
		System.out.println(list);
		System.out.println(l.get(2));
		System.out.println(l.get(4));
		l.putElement(4, "Table");
		System.out.println(l.get(4));
		System.out.println(list);
		
		

	}

}


//Q1:Design and implement a simple LRU (Least Recently Used) cache
//using a combination of Linked HashMap and LinkedList. 
//The cache should have a specified capacity, 
//and old entries should be evicted when the capacity is exceeded.