package Multithread;

public class JoinThread extends Thread {
	private final int number;
	
	public JoinThread(int number) {
		this.number = number;
	}
     public void run() {
    	 System.out.printf("\n Thread-Starting %s ", Thread.currentThread().getName(),number);
    	 try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	 System.out.printf("\n Thread Ending %s ", Thread.currentThread().getName(),number);
    	 
     }
}
