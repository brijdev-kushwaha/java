package Collection_Libraray;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String [] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("Brijdev");
		list.add("Kushwaha");
		list.add(1,"Kumar");
		//list.remove(1);
		list.set(0, "Vikash");
		
		if(list.contains("Brijdev")) {
			System.out.println(list.indexOf("Brijdev"));
		}
		
		//System.out.print(list.get(1));
		for(String str : list) {
			System.out.print(str);
		}
	}

}
