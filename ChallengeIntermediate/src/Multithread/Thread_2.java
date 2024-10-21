package Multithread;

public class Thread_2 extends Thread{
	
   public void run() {
	   for(int i = 1; i < 10; i++) {
		   System.out.print(" Hello from "+i);
		   System.out.println("  "+Thread.currentThread().getName());
	   }
	 
   }

}
