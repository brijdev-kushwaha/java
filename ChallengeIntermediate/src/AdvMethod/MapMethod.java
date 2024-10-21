
package AdvMethod;

import java.util.List;

public class MapMethod {
	public static void main(String[] args) {
		List<String> word = List.of("1","2","3","4","5");
		
		word.stream()
			.map(Integer::parseInt)
			.map(num -> Math.pow(num,2))
			.reduce(Double::sum)
			.ifPresent(System.out::println);
		}

}
