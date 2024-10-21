package Multithread;

public class Printthread extends Thread{

	private final int threadNumber;
	
	public Printthread(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.printf("(%d) %s Hello From Thread %d \n",(i+1),Thread.currentThread()
					.getName(),threadNumber);
		}
	}
}
