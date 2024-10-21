package LambdaAndStream;

import java.util.List;

public class Stream {
	public static void main(String[] args) {
		List<String> myList =  List.of("apple","banana","cherry","date");
		System.out.println("Normal print:   ");
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		System.out.println("With function print: ");
		
		// Here using stream function & lambda function 
		
		myList.stream()
		.filter(s -> s. endsWith("e"))
		.forEach(s -> System.out.println(s));
	}

}
