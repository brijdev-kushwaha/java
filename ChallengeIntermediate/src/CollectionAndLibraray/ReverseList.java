package CollectionAndLibraray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String [] arga) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(list);
		Reverse(list);
		System.out.print(list);
	}
	public static void Reverse(List<Integer> list) {
		Collections.reverse(list);
		
//		for(int i = 0; i < list.size() / 2; i++) {
//			
//			ListSwapping.swap(list,i,list.size() - 1 -i);
		
		//}
	}

}
