package operators;
public class Ternary_Operator {

	public static void main(String[] args) {
        int number = 7;
        // Using Ternary Operator
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(result); // Output: Odd Number
	}
}
/**
❓ Ternary (Conditional) Operator in Java
🔹 Definition:
	The ternary operator is a shortcut for the if-else statement.
	It is used to make decisions in a single line based on a condition.
	It is called ternary because it uses three operands.
	
	Syntax:	variable = (condition) ? value_if_true : value_if_false;
    condition → Expression to test (returns true or false)
	value_if_true → Value assigned if condition is true
	value_if_false → Value assigned if condition is false
**/