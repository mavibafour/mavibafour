package pack;

public class C extends A {

	public void m5() {
		m1();
		m2();
		System.out.println("xyzC");
	}
	public static void m6() {
		m2();
		C c=new C();
		A aa=new A();
		c.m1();
		//c.m5();
		

		System.out.println("abcC");
	}
	
}
