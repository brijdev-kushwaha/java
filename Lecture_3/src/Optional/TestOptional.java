package Optional;

import java.util.List;
import java.util.Optional;

public class TestOptional {
	public static void main(String[] args) {
		List<Integer> num = List.of(1,2,3);
		Optional<Integer> result = num.stream()
				.reduce((a,b) -> a + b);
		if(result.isPresent()) {
			System.out.println(result.get());
		}else{
			System.out.println("List is Empty");
		}
		}

}
