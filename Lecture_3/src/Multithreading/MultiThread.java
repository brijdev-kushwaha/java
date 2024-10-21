package Multithreading;

public class MultiThread {
	public static void main(String [] args) {
		
		long start = System.currentTimeMillis();
		
		// First
		for(int i = 1; i < 1000; i++) {
			System.out.print(" * " + i);
		}
		System.out.println();
		
		//Second
		for(int i = 1; i < 1000; i++) {
			System.out.print(" % " + i);
		}
		  System.out.println();
		  
		// Third
		for(int i = 1; i < 1000; i++) {
			System.out.print(" & " + i);
		}
		  System.out.println();
		  
		//Fourth
		for(int i = 1; i < 1000; i++) {
			System.out.print(" # " + i);
		}
		long end = System.currentTimeMillis();
		long CompleteTime = end - start;
		System.out.println();
	    System.out.printf("Task complition time: %d ", CompleteTime);
	}

}
