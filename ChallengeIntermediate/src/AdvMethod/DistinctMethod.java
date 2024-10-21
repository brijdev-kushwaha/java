package AdvMethod;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,4,3,1,6,7,8,3);
		List<Integer> distinctNumber = numbers.stream()
										.distinct()
										 .collect(Collectors.toList());
		System.out.println("Old List:  "+ numbers);
		System.out.println("New List: "+ distinctNumber);
	}

}
