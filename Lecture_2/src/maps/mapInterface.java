package maps;

import java.util.HashMap;
import java.util.Map;

public class mapInterface {
	public static void main(String [] args) {
		Map<String,Integer> Student = new HashMap<>();
		Student.put("Brijdev", 322089);
		Student.put("juned", 322127);
		Student.put("musafir",322167);
		Student.put("bittu", 322082);
		
		System.out.println("Student remove Succesfully: " + Student.remove("bittu"));
		System.out.println("Is Student Exist:" + Student.containsKey("Brijdev"));
		System.out.println(Student.keySet());
		System.out.println(Student.values());
		
		for(String key : Student.keySet()) {
			System.out.printf("Student keys %s : %s\n", key , Student.get(key));
		}
		
	}

}
