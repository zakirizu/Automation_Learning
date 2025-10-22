package java_Learning;

public class AritheMeticOperations {
	
	int a;
	int b;
	/*
	 * Constructor
Method it has name exactly same as class Name
It will be called automatically when ever you are creating a object for that class
It will not have any return type
	 */
	
	public static void main(String[] args) {
		AritheMeticOperations obj = new AritheMeticOperations();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
	}
	
	public void AritheMeticOperations() {
		System.out.println("This is Constructor");
		a = 10;
		b = 5;
	}
	
	public void addition() {
		int c = a + b;
		System.out.println("Addition Method "+c);
	}
	
	public void subtraction() {		
		int c = a - b;
		System.out.println("Subtraction Method " +c);
	}
	
	public void multiplication() {	
		int c = a * b;
		System.out.println("Multiplication Method " +c);
	}
	

}
