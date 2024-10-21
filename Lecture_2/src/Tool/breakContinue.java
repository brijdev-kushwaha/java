package Tool;

public class breakContinue {
	public static void main(String [] args) {
	for(int i = 0; i <= 20; i++) {
		if(i == 19) {
			break;
		}
		System.out.print(i+ " ");
	}
	Cont();

}
	public static void Cont() {
		for(int i = 0; i <= 19; i++) {
			if(i == 13) {
				continue;
			}
			System.out.println(i + " ");
		}
	}
}