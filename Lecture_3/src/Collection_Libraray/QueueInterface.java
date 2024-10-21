package Collection_Libraray;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] arg) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(34);
		queue.offer(23);
		//queue.remove();
		//queue.poll();
		//queue.element();
		
		System.out.println(queue.peek());
		
		System.out.print("Total collection is : ");
		
		
		for(int element : queue) {
	        System.out.println(element);
		}
		
		
	}

}
