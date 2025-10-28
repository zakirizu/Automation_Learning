package static_NonStatic_Methods;

public class Static_Method {

    public static void main(String[] args) {
        // Calling static method directly
        greet();

        // or using class name
        Static_Method.greet();

        // Calling non-static method → requires an object
        Static_Method obj = new Static_Method();
        obj.showMessage();
    }
    
    // static method
    static void greet() {
        System.out.println("Hello, Blue Moon! Welcome to Java.");
    }

    // instance method
    void showMessage() {
        System.out.println("This is a normal (non-static) method.");
    }
}
/**
🔹 What is a Static Method in Java?
A static method is a method that belongs to the class, not to any specific object.
It is declared using the static keyword and can be called without creating an object.

🧠 Key Points
Declared using	static keyword
Belongs to	Class (not object)
Accessed by	Class name (e.g., ClassName.methodName())
Can access	Only static variables and other static methods directly
Cannot use	this or super keywords
When it runs	As soon as the class is loaded (even before any object creation)

Explanation:
The greet() method is static, so you can call it without creating an object.
The showMessage() method is non-static, so it requires an object (obj.showMessage()).
**/