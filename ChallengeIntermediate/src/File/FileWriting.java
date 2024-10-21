package File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String [] args) {
		String FileName = "Babu.txt";
		
		try(FileWriter writer = new FileWriter(FileName)){
			
			writer.write("Hey! my name is Brijdev Kushwaha");
			writer.flush();
			System.out.print("File Written succesfully.....");
		}
		catch(IOException e) {
			System.out.print("Exception occured: " + e.getMessage());
		}
	}

}
