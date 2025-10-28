package variables;

public class Defafult_Values_Of_Varibles{
	//Instance Variable ->//No Need to initiliaze value
//Primitive Data Types
byte byteValue;
short shortValue;
int intValue;
long longValue;
float floatValue;
double doubleValue;
char charValue;
boolean boooleaValue;

//Non-Primitieve Data Types

String stringValue;
int[] intArray;

	public static void main(String[] args) {
		Defafult_Values_Of_Varibles obj = new Defafult_Values_Of_Varibles();
		obj.DefaultValuesPrinter();
}




	private  void DefaultValuesPrinter() {
	       System.out.println("byte: " + byteValue);
	        System.out.println("short: " + shortValue);
	        System.out.println("int: " + intValue);
	        System.out.println("long: " + longValue);
	        System.out.println("float: " + floatValue);
	        System.out.println("double: " + doubleValue);
	        System.out.println("char: " + charValue);
	        System.out.println("boolean: " + boooleaValue);

	     
	        System.out.println("String: " + stringValue);
	          System.out.print("Array: ");
		
	}

	
	
	
	
	
}
