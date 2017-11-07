package packinterface;

public class D {

	/*
	 * public void add(int a, int b) { System.out.println(a + b); }
	 * 
	 * public void mul(int a, int b) { System.out.println(a * b); }
	 * 
	 * public static void main(String[] args) { D d=new D(); d.add(11, 33);
	 * d.mul(11, 33); }
	 */

	int a;
	int b;

	public D(int a1, int b1) {
		a = a1;
		b = b1;
	}

	public void m(int x,  int y) {
		
	}
	public void add() {
	//	static int x=11;
		System.out.println(a + b);
	}
	public void mul() {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		D d=new D(11,22);
		d.add();
		d.mul();
	}

}
