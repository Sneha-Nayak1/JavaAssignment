package streamsAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		List<Integer> l =new ArrayList<Integer>();
		System.out.println("Enter 7 numbers in list");
		for(int i=0;i<7;i++) {
			l.add(s.nextInt());
		}
		l.stream().filter(n ->n%2==0).forEach(n -> System.out.println(n*n));
	}

}
