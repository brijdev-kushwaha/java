package Multithread;

public class TestStateThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadState p1 = new ThreadState();
		
		System.out.printf("\n Create the thread %s ", p1.getState());
		
		p1.start();
		p1.join();
		System.out.printf("\n finish the thread %s ", p1.getState());
		

	}

}
