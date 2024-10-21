package Multithread;

public class Thread_1 extends Thread {
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.print("Hey! from " + i);
			System.out.println(" "+ Thread.currentThread().getName());
		}
		
	}

}
