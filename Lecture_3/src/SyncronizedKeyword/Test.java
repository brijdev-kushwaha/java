package SyncronizedKeyword;

public class Test {
	public static void main(String [] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
  counter counter = new counter();
  syncronizedThread t1 = new syncronizedThread(counter);
  syncronizedThread t2 = new syncronizedThread(counter);
  
  t1.start();
  t2.start();
  
  t1.join();
  t2.join();
  
  long endTime = System.currentTimeMillis();
  System.out.printf("Final count is %d\n  completion time: %d", counter.getCount(), (endTime - startTime));
  
}
}