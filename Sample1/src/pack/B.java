package pack;

public class B {

	public void m3() {
		A a1=new A();
		a1.m1();
		A.m2();
		System.out.println("xyzB");
	}
	public static void m4() {
		A a2=new A();
		a2.m1();
		A.m2();
		System.out.println("abcB");
	}
	
	public static void main(String[] args) {
		/*m4();
		B bb=new B();
		bb.m3();*/
		A a3=new A();
		a3.m1();
		A.m2();
	}

}
