package operators;

public class Arithemetic_Operations {
	
	int a=10;
	int b=5;

	
	public static void main(String[] args) {
		Arithemetic_Operations obj = new Arithemetic_Operations();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
		obj.modulus();
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
	
	public void division() {	
		int c = a / b;
		System.out.println("Division Method " +c);
	}
	
	public void modulus() {	
		int c = a % b;
		System.out.println("Modulus Method " +c);
	}
	

}

/**
🧮 Arithmetic Operators in Java
Arithmetic operators are used to perform basic mathematical operations on variables and values.

Types of Arithmetic Operators
+	Addition			Adds two values						10 + 5	15
-	Subtraction			Subtracts right operand from left	10 - 5	5
*	Multiplication		Multiplies two values				10 * 5	50
/	Division			Divides left operand by right		10 / 5	2
%	Modulus				Returns the remainder				10 % 3	1
 **/
