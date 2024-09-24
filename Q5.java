package streamsAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q5 {
	
	public static List<Integer> generateRandom(int size){
		List<Integer> m=new ArrayList<>();
		Random r=new Random();
		for(long i=0;i<size;i++) {
			m.add((int) r.nextLong());
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=generateRandom(100000000);
		
		long start2= System.currentTimeMillis();
		int sum2=list.parallelStream().mapToInt(n -> n).sum();
		long end2=System.currentTimeMillis();
		long duration2 =end2-start2;
		System.out.println("Parallel sum is: "+sum2);
		System.out.println("Parallel Stream: "+ duration2);
		
		System.out.println();
		long start= System.currentTimeMillis();
		int sum=list.stream().mapToInt(n -> n).sum();
		long end=System.currentTimeMillis();
		long duration =end-start;
		System.out.println("Sequential sum is: "+sum);
		System.out.println("Sequential Stream: "+ duration);
		
		
	}

}
