package variables;

public class Static_Variables { 
	
int id;                // Instance variable
String name;           // Instance variable
static String college = "BlueStone College";  // Static variable

public void display() {
    System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
}

public static void main(String[] args) {
	Static_Variables s1 = new Static_Variables();
    s1.id = 101;
    s1.name = "Blue Moon";

    Static_Variables s2 = new Static_Variables();
    s2.id = 102;
    s2.name = "Zakir";

    s1.display();
    s2.display();

    // Changing static variable value
    Static_Variables.college = "Tech World University";

    System.out.println("\nAfter changing static variable:\n");

    s1.display();
    s2.display();
}
}

/**
 🔹 What is a Static Variable?
A static variable is declared using the static keyword inside a class, but outside any method, constructor, or block.
It belongs to the class, not to any specific object.
That means — all objects share the same copy of that variable.
**/

/**
 🧠 Key Points
Declared using	static keyword
Belongs to	The class, not to objects
Memory allocation	Only once, when class is loaded
Shared among	All objects of the class
Accessed using	Class name (ClassName.variableName)
Default values	Yes, Java assigns them automatically
 **/
