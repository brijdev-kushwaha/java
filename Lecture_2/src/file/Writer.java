package file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public static void main(String [] args) {
		String fileName = "java-course.txt";
		
		try(FileWriter writer = new FileWriter(fileName)){
			
			writer.write("Hello , This is vikash its my personal notebook");
			writer.flush();
			System.out.print("File Written succesfully......");
		}
		
		catch(IOException exception) {
			System.out.printf("Exception occured %s", exception.getMessage());
		}
	}

	
}
