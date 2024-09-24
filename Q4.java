package streamsAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3), 
				                               Arrays.asList(1,5,6), 
				                               Arrays.asList(6,8,5));
		
		List<Integer> l=list.stream().flatMap(n -> n.stream())
				                     .distinct()
				                     .collect(Collectors.toList());
		System.out.println(l);
	}

}
