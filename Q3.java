package streamsAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="apple cat dog ant cow door bat ball animal";
		
		String[] str=s.split("\\s+");
		Map<Character, Long> map=Arrays.stream(str)
		.collect(Collectors.groupingBy(n -> n.charAt(0),
				Collectors.counting()));
		map.forEach((let,count) -> System.out.println("Letter: "+ let+" Count: "+count));
		

	}

}


// Create a program that reads a list of words from a file,
//uses Streams and Lambda Expressions to group the words by their first letter,
//and then counts the number of words in each group. Print the result.