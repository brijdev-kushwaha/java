package basic;

public class RelationOperator {

	public static void main(String[] args) {
		
		// == equality
		
		int a = 30;
		int b = 45;
		
		int c = 55;
		int d = 88;
		
		int e = 44;
		int f = 34;
		
		int g = 43;
		int h = 39;
		
		int i = 38;
		int j = 54;
		
		int k = 67;
		int l = 89;
		
		if(a==b)
		{
		 System.out.print(" a and b are not Equal");
		}
		else
		{
			System.out.println("a and b are Not Equal");
		}
		
		// != Not Equality
		
		if(c!=d)
		{
			System.out.println("c and d are not equal");
		}
		else {
			System.out.println("c and d are equal");
		}
		
		//Greater Then
		
		if(e > f)
		{
			System.out.println("e is greater then f");
		}
		else {
			System.out.println("e is less then f");
		}
		
		// Less than
		
		if(g < h) {
			System.out.println("g is less then h");
		}
		else
		{
			System.out.println("g is greater then h");
		}
		
		//Greater than equal to 
		
		if ( i >= j)
		{
			System.out.println(" i is greater & equal to j");
		}
		else
		{
			System.out.println("i is not greater & equal to j");
		}
		
		// Less than equal to 
		
		if(k <= l)
		{
			System.out.println("k is less or equal to l");
		}
		else
			System.out.println("k is greater than l");
	}

}
