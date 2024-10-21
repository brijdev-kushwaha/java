package CollectionAndLibraray;

public class StringConcatenate {
	
	public static String concatenate(String...strs) {
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			sb.append(str).append(" ");
		}
		return sb.toString();
	}
	public static void main(String [] args) {
		System.out.println(concatenate("Brijdev"));
		System.out.println(concatenate("Kumar","Kushwaha"));
		System.out.println(concatenate("Dubauli"));
		System.out.println(concatenate("Padrauna","Kushinagar","Uttar","Pradesh"));
	}

}
