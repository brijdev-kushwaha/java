package Collection_Libraray;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String [] args) {
		Set<String> names = new HashSet<>();
		System.out.println(names.add("Brijdev"));
		System.out.println(names.add("Kumar"));
		System.out.println(names.add("Kushwaha"));
		System.out.println(names.add("Vikash"));
		//System.out.println(names.remove("Brijdev"));
		
		if(names.contains("adfa")) {
			System.out.println(names.remove("Brijdev"));
		}
		for(String str : names) {
			System.out.println(str);
		}
		System.out.print(names.size());
	}

}
