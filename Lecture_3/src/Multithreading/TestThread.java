package Multithreading;

public class TestThread {
	public static void main(String []args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		Thread_3 t3 = new Thread_3();
		
		System.out.println("First Thread Starting ");
		t1.start();
		System.out.println("Second Thread Starting ");
		
		t2.start();
		t2.join();   // Until Thread does not complete Thread will stop.
		
		System.out.println("Third Thread Starting ");
		t3.start();
		
		t1.setPriority(Thread.MAX_PRIORITY);   // which Thread we want to execute first to set priority 
		t2.setPriority(Thread.MIN_PRIORITY);
		
		 long task = System.currentTimeMillis();
		 System.out.printf("Task completion time %d: ",(task - start));
	}

}
