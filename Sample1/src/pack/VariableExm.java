package pack;


public class VariableExm {
	
	//global variable on non static variables
	long l=100; 
	int i;
	//int b;
	//static or class variable
	static int ii=2000;
	
	public void m1() {
		int b=100;//local variable
		System.out.println(l+i+b+ii);
		m2();
		m3();
	}
	public void m2() {
		int d=200;
		//System.out.println(l+i+b+d);
		System.out.println(l+i+d);
	}
	
	public static void m3() {
		VariableExm vv=new VariableExm();
		System.out.println(vv.l+ii);
	}
	
	public static void main(String[] args) {
		VariableExm v=new VariableExm();
		v.m1();//200
		//v.m2();//300
	}

}
