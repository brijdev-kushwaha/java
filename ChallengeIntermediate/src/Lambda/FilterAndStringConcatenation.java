package Lambda;

import java.util.List;

public class FilterAndStringConcatenation {
	public static void main(String[] args) {
		List<String> str = List.of("Brijdev kushwaha","abc","In GNIOT College","in","other"
				,"Greater Noida ","Institute","Bihar","from","Uttar Pradesh");
		
		String result = str.stream()
			.filter(name -> name.length() > 10)
			.reduce(" ", (a, b) -> a+" "+b);
		System.out.println(result);
	}

}
