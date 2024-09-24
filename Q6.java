package streamsAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("sneha","divyashree","tejaswiSHETTY","vcti");
		list.stream().forEach(s-> System.out.println( s+ " -> "+s.length()));
		
		System.out.println();
		System.out.println();
		
		List<String> str=list.stream().peek(s -> System.out.println("Original Strings are: "+ s))
                     .map(String::toUpperCase)
                     .peek(s -> System.out.println("Modified Strings are: "+ s))
                     .collect(Collectors.toList());
		//System.out.println(str);
		
		
//		List<String> l=list.stream()
//				           //.peek(s -> System.out.println("Original Strings are: "+ s))
//				           .map(String::toUpperCase)
//				           .forEach(s-> System.out.println("length are: "+s.length()))
//				           .peek(s -> System.out.println("Modified Strings are: "+ s))
//				           .collect(Collectors.toList());
		
		
	}

}
