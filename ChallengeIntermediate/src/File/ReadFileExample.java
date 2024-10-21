package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file path: ");
		String fileName =  input.next();                  //"java-course.txt";
		
		try(FileReader reader = new FileReader(fileName)){
			
			int read;
			do {
				read = reader.read();
				System.out.print((char) read);
			}while(read != -1);
			
		}catch(IOException e) {
			System.out.printf("Exception occured: %s", e.getMessage());
		}
	}

}
