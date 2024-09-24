package collections1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Objects;

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		if(id>o.id) {
			return 1;
		}else if(id<o.id) {
			return -1;
		}else
		return 0;
	}

	    @Override
	    public String toString() {
	        return id + " --> " + name;
	    }
	
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> tree=new TreeSet<>();
		Employee e1=new Employee(2,"Sneha");
		Employee e2=new Employee(4,"Shrilakshmi");
		Employee e3=new Employee(3,"Divya");
		Employee e4=new Employee(1,"Tejaswi");
		
	
		
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		tree.add(e4);
		
		System.out.println("TreeSet");
		for(Employee e:tree)
//		System.out.println(e.id+" --> "+e.name);
			System.out.println(e);
		
		
		System.out.println("----------------------------------------");
		
		
		System.out.println("HashSet");
		HashSet<Employee> hash=new HashSet<>();
		hash.add(e1);
		hash.add(e2);
		hash.add(e3);
		hash.add(e4);
		
		for(Employee e:hash)
		//	System.out.println(e.id+" --> "+e.name);
			System.out.println(e);
		System.out.println("-----------------------------------------");
		
		System.out.println("LinkedHashSet");
		LinkedHashSet<Employee> link=new LinkedHashSet<>();
		link.add(e1);
		link.add(e2);
		link.add(e3);
		link.add(e4);
		
		for(Employee e:link)
			//System.out.println(e.id+" --> "+e.name);
			System.out.println(e);
		System.out.println("-----------------------------------------");
		
		

	}

}
//Q7: Write program to Store custom objects into tree set 
//and maintain orders of object based on specific object property.
//Do same with hash set and linked hash set validate the result.
//For Example: Employee class has id and name attributes. 
//Set should maintain employee instance by employee id.


