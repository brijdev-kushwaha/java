package Multithread;

public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
		JoinThread t1 = new JoinThread(1);
		JoinThread t2 = new JoinThread(2);
		JoinThread t3 = new JoinThread(3);
		
		t1.start();
	    t1.join();
	    t2.start();
	    t2.join();
	    t3.start();
	    t3.join();
		

	}

}
