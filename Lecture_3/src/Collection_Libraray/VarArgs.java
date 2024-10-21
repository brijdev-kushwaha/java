package Collection_Libraray;

public class VarArgs {
	public static void main(String... args) {
		
		System.out.print(sum(2,353,563,63,43,53,563,33,343,43,53,53,45,43,534));
		
	}
   public static long sum(int num1, int num2, int...a) {
	   int sum = num1 + num2;
	   for(int element : a) {
		   sum += element;
	   }
	   return sum;
   }
  
}
