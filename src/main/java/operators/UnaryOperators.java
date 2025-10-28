package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		UnaryOperators obj = new UnaryOperators();
		obj.UnaryOperators();
	}
	
	public  void UnaryOperators() {
		
		int x = 5;
		//++ -> Increment Operator 
			//Pre Increment ++x
			//Post Increment x++
		System.out.println(++x);//6
		System.out.println(x++);//11 -> 12
		System.out.println(x);//12
		System.out.println(--x);//11
		System.out.println(x);//11
		System.out.println(x--);//11 -> 10
		//-- -> Decrement OperatorQ
			//Pre Decrement  --x
			//Post Decrement x--

		
		
	}

}

/**
☑️ Unary Operators in Java

Definition: Unary operators work on a single operand to perform various operations like incrementing, decrementing, negating, or inverting a value.

Types of Unary Operators

++	Increment			Increases value by 1					++x or x++	x = x + 1
--	Decrement			Decreases value by 1					--x or x--	x = x - 1
!	Logical NOT			Reverses the boolean value				!true	false
+	Unary Plus			Indicates a positive value (no change)	+x (if x = 5)	5
-	Unary Minus			Negates a value (changes sign)			-x (if x = 5)	-5

**/