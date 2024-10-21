package SingleExecutorService;

public class Printstar implements Runnable {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.printf("\n Number is : %s", i+1);
		}
	}

	

}
