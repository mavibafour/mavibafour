package opps4;

public class B extends A {

	private void add(int a, float b) {
		System.out.println(a + b);
	}

	public void design() {
		System.out.println("child design with 150cc");
	}

	public static void main(String[] args) {
		new B().design();
		new A().design();
	}
}
