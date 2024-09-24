package collections1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

class StudentComparator implements Comparator<Student>{
	
	
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.id<s2.id) {
			return 1;
		}else if(s1.id>s2.id) {
			return -1;
		}else
		return 0;
	}
	
}


public class PriorityQueueExmpl {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Student> pq=new PriorityQueue<Student>(5, new StudentComparator());
		Student s1=new Student(2,"Sneha");
		Student s2=new Student(1,"Abhi");
		Student s3=new Student(4,"Ram");
		Student s4=new Student(3,"Suraj");
		
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		
		 System.out.println("Students info:");
		 Iterator iterator = pq.iterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next() + " ");
	        }
	        System.out.println();

         pq.remove(s1);
        
       System.out.println("Students info after removing Sneha:");
       Iterator it=pq.iterator();
         while(it.hasNext()) {
        	 System.out.println(it.next());
         }
         System.out.println(); 
         System.out.println("Updating Ram to Ram Rao:");
         if(pq.contains(s3)) {
        	 pq.remove(s3);
        	 s3.name="Ram Rao";
        	 pq.add(s3);
         }
         Iterator it2=pq.iterator();
         while(it2.hasNext()) {
        	 System.out.println(it2.next());
         }
         
         

}
}
/*Q8: Design a priority queue that works with custom objects. 
 * The priority should be based on a specific property of the objects,
 *  and the queue should efficiently support adding,
 *   removing, and updating elements*/
 