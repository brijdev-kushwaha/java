package Lambda;

import java.util.List;

public class StreamTesting {
   public static void main(String[] args) {
	List<String> names = List.of("Suraj","Shakti","Brijdev");
	      names.stream()
	  			.forEach(str -> str.toLowerCase());
	   				
	  		
	       //.forEach(name -> System.out.println(name));
}

}
