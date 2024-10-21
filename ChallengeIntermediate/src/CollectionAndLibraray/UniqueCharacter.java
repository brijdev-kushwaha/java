package CollectionAndLibraray;

import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
	public static void main(String [] args) {
		Set<Character> unique = new HashSet();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your character: ");
		String str = input.next();
		
		for(char ch : str.toCharArray()) {
			unique.add(ch);
		}
		System.out.print("Your unique Chararter is: " + unique.size());
	}

}
