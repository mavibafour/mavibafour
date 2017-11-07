package packinterface;

public class EE extends E{

	
	int a=200;
	public void add() {
		System.out.println(super.a);
		System.out.println(a+super.a);
	}
	
	public static void main(String[] args) {
		new EE().add();
	}
}
