package SyncronizedKeyword;

public class counter {
	private int count = 1;
	
	public synchronized void increament() {
	    count++;
	}
	public int getCount() {
		return count;
	}

}
