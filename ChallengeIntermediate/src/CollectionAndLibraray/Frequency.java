package CollectionAndLibraray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,4,1,3,55,51,2,3,51,4,55,5,4);
		
		System.out.println(Collections.frequency(list,3));
		System.out.println(Collections.frequency(list,4));
		System.out.println(Collections.frequency(list,55));
		System.out.println(Collections.frequency(list,51));
	}

}
