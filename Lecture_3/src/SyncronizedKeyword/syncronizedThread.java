package SyncronizedKeyword;

public class syncronizedThread extends Thread {
	private counter counter;
	
	public syncronizedThread(SyncronizedKeyword.counter counter) {
		this.counter = counter;
	}
   public void run() {
	   for(int i = 1; i <= 10000; i++) {
		   counter.increament();
	   }
   }
}
