package collections1;

import java.util.HashMap;

public class CustomCache {
	static HashMap<Integer, String> map1=new HashMap<>();
	static int capacity=2000;
	static int i=1;
	public void putElement(String str) {
		
		if(map1.size()<capacity) {
			map1.put(i, str);
			i++;
		}else {
			System.out.println("Cache is full");
		}
	}
	
	public String get(int key) {
		return map1.get(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomCache c=new CustomCache();
		for(int i=1;i<=capacity;i++) {
			c.putElement("value "+i);
		}
		c.putElement("sneha");
		//System.out.println(map);
		System.out.println(c.get(6));
	}

}


//Q2: Create your own custom cache using HashMap.
//Create cache, able to add 2000 values and read values from cache.



