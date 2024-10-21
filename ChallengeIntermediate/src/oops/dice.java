package oops;

 class dice {
	 static int roll() {
		double random = Math.random() * 6;
		return (int)Math.ceil(random);
	}
	public static void main(String[] args) {
		dice ds = new dice();
		for(int i = 0; i < 50; i++) {
			System.out.print(dice.roll()+" ");
		}
	}

}
