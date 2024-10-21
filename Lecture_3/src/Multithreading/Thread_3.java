package Multithreading;

public class Thread_3 extends Thread{
	
	public void run() {
		// First
				for(int i = 1; i < 1000; i++) {
					System.out.print(" @ " + i);
				}
				System.out.printf("\n Task complete %s:", Thread.currentThread().getName());
				System.out.println();
	}

}
