package pack;

public class AA {

	
	public void m1() {
		m2();
		m3();
	}
	public static void m2() {
		AA a=new AA();
		a.m1();
		m4();
	}
	public void m3() {
		
	}
	public static void m4() {
		
	}
}
