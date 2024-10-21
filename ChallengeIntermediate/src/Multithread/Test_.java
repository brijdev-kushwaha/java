package Multithread;

public class Test_ {
	public static void main(String [] args) {
		Printthread p1 = new Printthread(1);
		Printthread p2 = new Printthread(2);
		
		p1.start();
		p2.start();
	}

}
