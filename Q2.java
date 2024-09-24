package streamsAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		List<String> l=Arrays.asList("bbb","aa","ddddd","eeeeee","cccc");
		
		List<String> m=l.stream()
				        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
				        .limit(3)
				        .collect(Collectors.toList());
		System.out.println(m);
		

		
	}

}
