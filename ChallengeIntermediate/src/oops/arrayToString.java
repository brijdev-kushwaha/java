package oops;

public class arrayToString {
	public static void main (String [] args) {
		String[] arr = new String[] {"this", " is ", " the ", " best ", " Java ", "Course" ,"On " ,"Youtube"};
		StringBuilder sb = new StringBuilder();
		for(String str : arr) {
			sb.append(str).append(" ");
		}
		System.out.print(sb);
	}

}
