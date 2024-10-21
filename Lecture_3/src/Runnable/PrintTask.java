package Runnable;

public class PrintTask implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d %s  ", i ,targetChar);
		}
		System.out.printf("%s %s Task complete ",Thread.currentThread().getName(),targetChar);
		System.out.println();
	}
	
	private final char targetChar;
	
	public PrintTask(char targetChar) {
		this.targetChar = targetChar;
	}

}
