package operators;
public class Relational_Operators {
	//static variables
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		  System.out.println(a == b);  // false
		  System.out.println(a != b);  // true
		  System.out.println(a > b);   // false
		  System.out.println(a < b);   // true
		  System.out.println(a >= b);  // false
		  System.out.println(a <= b);  // true
	}
}

/**
⚖️ Relational (Comparison) Operators in Java

🔹 Definition: Relational operators are used to compare two values (operands). They return a boolean result — true or false.

1️⃣ List of Relational Operators

==	Equal To					Checks if two values are equal			5 == 5		true
!=	Not Equal To				Checks if two values are not equal		5 != 3		true
>	Greater Than				Checks if left is greater than right	7 > 5		true
<	Less Than					Checks if left is smaller than right	3 < 8		true
>=	Greater Than or Equal To	Checks if left ≥ right					10 >= 10	true
<=	Less Than or Equal To		Checks if left ≤ right					4 <= 5		true
**/