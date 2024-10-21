package Collection_Libraray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(44);
		list.add(-4);
		list.add(54);
		list.add(89);
		
		System.out.println("original list: "+ list);
		
		Collections.sort(list);
		System.out.println("Sorted list" + list);
		
		Collections.reverse(list);
		System.out.println("After reversal: " + list);
		
		Collections.shuffle(list);
		System.out.println("shuffle list : " + list);
		
		System.out.println("Size of :" + list.size());
		
		//Collections.binarySearch(null,null);
		
		
		System.out.println("Collection is  : ");
		for(int i : list) {
			
			System.out.print(i+" ");
		}
		
	}

}
