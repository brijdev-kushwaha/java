package basic;

public class twoDarry {

	public static void main(String[] args) {
		int arr[][] = new int[2][2]; //2D Array Initialize
		arr[0][0] = 2;
		
		int Myarr[][] = {{2,4,6,},{4,5,8,}, {3,7,33}};
		//System.out.println(Myarr[0][2]); 
		
		//2d array Traversal
		
		int row = 0;
		while(row <Myarr.length) {
			int colom = 0;
			while(colom < Myarr[row].length) {
				System.out.print(Myarr[row][colom]+ " ");
				colom++;
			}
			row++;
		}

	}

}
