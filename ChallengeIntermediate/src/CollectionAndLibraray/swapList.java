
package CollectionAndLibraray;

import java.util.Arrays;
import java.util.List;

public class swapList {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,4,1,3,55,51,2,3);
        System.out.println(list);
        swap(list,1,4);
        System.out.print(list);
		
	}
	public static void swap(List<Integer> list,int x, int y) {
		int swap = list.get(x);
		list.set(x,list.get(y));
		list.set(y,swap);
	}

}
