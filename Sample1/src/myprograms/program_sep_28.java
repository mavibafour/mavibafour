package myprograms;

//static and non static
public class program_sep_28 {
	
	public void p1() {
		
		System.out.println("this is non static metod");
	}

	public static void p2() {
		
		System.out.println(" this is  static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		p2();
		
		program_sep_28 p3 = new program_sep_28();
		p3.p1();
	}

}
