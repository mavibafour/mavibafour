package packDataTypesExm;

public class DataTypesConcepts {
	
	//byte, short, int, long, float, double, char, boolean are primitive data types, and b...to...bool are variable names.
	byte b; 
	short s; 
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	byte b_Max=Byte.MAX_VALUE;
	//byte bb=-129;
	byte b_Min=Byte.MIN_VALUE; 
	short sMax=Short.MAX_VALUE;
	short sMin=Short.MIN_VALUE;
	String str;//declaration
	String name="XYZ Java";//initialization
	
	public void data_Types_Default_Values() {
		System.out.println("Byte default value is :"+b);
		System.out.println("Boolean default value is :"+bool);
		System.out.println("String default value is :"+str);
		System.out.println(name);
		
	}
	
	
	public void dataTypesRange() {
		System.out.println("Byte max value  is:"+b_Max);
		System.out.println("Byte min value  is:"+b_Min);
		System.out.println("Short max value  is:"+sMax);
		System.out.println("Short min value  is:"+sMin);
	}
	
	public static void main(String[] args) {
		DataTypesConcepts obj=new DataTypesConcepts();
		obj.data_Types_Default_Values();
		//obj.dataTypesRange();
		
	}

	
}
