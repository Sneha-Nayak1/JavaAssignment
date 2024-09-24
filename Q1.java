package exceptionHandling;

import java.util.ArrayList;
import java.util.List;



public class Q1 {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory());
		System.out.println("Total memory: "+r.totalMemory());
		 try {
	            List<Object> objects = new ArrayList<>();
	      
	            while (true) {
	                objects.add(new Object());
	                
	            }
	        } catch (OutOfMemoryError e) {
	           
	           System.out.println("Total memory: "+ r.totalMemory());
	        }
	}

}
/*Write program for OutofMemory Exception and its prevention 
 * (Its design issue or memory leak differentiate it.)*/
 