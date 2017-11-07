package stringExm;

public class A {

	// String x="Hello";
	String x = new String("Helllo");
	String xx=x.concat("  java");
	// StringBuffer y="Hi";//can't
	static StringBuffer y = new StringBuffer("Hi");

	public void m() {
		/*System.out.println(x);
		System.out.println(xx);
		System.out.println(x);*/
		System.out.println(y);
		System.out.println(y.append(", I am good"));
		System.out.println(y);
	}

	public static void main(String[] args) {
		new A().m();
	}
}
