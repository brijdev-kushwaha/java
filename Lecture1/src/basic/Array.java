package basic;

public class Array {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 24;
		arr[5] = 25;
		arr[3] = 56;
		arr[2] = 26;
		arr[1] = 35;
		
		//System.out.println(arr[1]);
		
		//array traversal
		
		int index = 0;
		while(index < arr.length) {
			System.out.println(arr[index]);
			index++;
		}

	}

}
