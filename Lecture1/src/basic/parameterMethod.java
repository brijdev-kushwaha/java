package basic;

 class parameterMethod {
	
	public static int Add(int a, int b) { //funciton
		return a + b;
		
	}

	public static void main(String[] args) {
		int result= Add(23,33);
		greeting();
		System.out.println(result);
		

	}
	public static void greeting() {
		System.out.print("Hello! Brijdev you do not give up , you can do it Well..");
	}

}
