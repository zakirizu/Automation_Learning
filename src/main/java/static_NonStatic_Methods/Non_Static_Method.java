package static_NonStatic_Methods;

public class Non_Static_Method {

    public static void main(String[] args) {
        // Create an object to call non-static method
    	Non_Static_Method obj = new Non_Static_Method();
        obj.sayHello();  // calling instance method
    }
    
	   // Non-static method
	 public void sayHello() {
	     System.out.println("Hello, Blue Moon! Welcome to Java.");
	 }

}
/**
🔹 What is a Non-Static (Instance) Method?
A non-static method belongs to an object of a class — not to the class itself.
That means you must create an object to call it.

🧠 Key Points
Declared without	static keyword
Belongs to	Each object (instance)
Accessed using	Object reference (e.g., obj.methodName())
Can access	Both static and non-static variables
Can use	this and super keywords
Memory allocation	Happens when an object is created
**/
