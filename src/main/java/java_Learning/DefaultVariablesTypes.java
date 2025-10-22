package java_Learning;

public class DefaultVariablesTypes {
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
		DefaultVariablesTypes obj = new DefaultVariablesTypes();
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
