package operators;

public class Logical_Operators {

	public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        // Logical AND (&&)
        System.out.println((a > b) && (a < c)); // true && true → true
        System.out.println((a > b) && (a > c)); // true && false → false

        // Logical OR (||)
        System.out.println((a > b) || (a > c)); // true || false → true
        System.out.println((a < b) || (a > c)); // false || false → false

        // Logical NOT (!)
        boolean result = (a > b); // true
        System.out.println(!result); // false

	}

}
/**
🧠 4. Logical Operators in Java
Logical operators are used to combine two or more conditions (boolean expressions) and return a boolean result — either true or false.
They are mainly used in decision-making (like if, while, for, etc.).

1️⃣ Types of Logical Operators

&&			Logical AND			Returns true only if both conditions are true	(a > b) && (a > c)	true if both true
||			Logical OR			Returns true if any one condition is true
!			Logical NOT			Reverses the boolean result	!(a > b)	true if (a > b) is false
**/
