package operators;
public class Assignment_Operators {

	public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value: " + a);
        a += 5;  // a = a + 5
        System.out.println("After += : " + a); // 15
        a -= 3;  // a = a - 3
        System.out.println("After -= : " + a); // 12
        a *= 2;  // a = a * 2
        System.out.println("After *= : " + a); // 24
        a /= 4;  // a = a / 4
        System.out.println("After /= : " + a); // 6
        a %= 4;  // a = a % 4
        System.out.println("After %= : " + a); // 2
	}
}

/**
📝 5. Assignment Operators in Java
🔹 Definition: Assignment operators are used to assign values to variables.
The basic assignment operator is =, and compound operators combine arithmetic or bitwise operations with assignment.

1️⃣ List of Assignment Operators
	=	Simple Assignment		Assigns right value to left variable				a = 5		—	a = 5
	+=	Add and 				Assign	Adds right value to left variable			a += 3		a = a + 3	13
	-=	Subtract and 			Assign	Subtracts right value from left variable	a -= 4		a = a - 4	6
	*=	Multiply and 			Assign	Multiplies left and right operands			a *= 2		a = a * 2	20
	/=	Divide and 				Assign	Divides left operand by right				a /= 2		a = a / 2	5
	%=	Modulus and 			Assign	Takes remainder and assigns					a %= 3		a = a % 3	1
**/