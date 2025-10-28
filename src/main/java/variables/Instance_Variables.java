package variables;

public class Instance_Variables {
  // Instance Variables
    int id;
    String name;
    int age;
	
    public static void main(String[] args) {
        // Creating first object
    	Instance_Variables s1 = new Instance_Variables();
        s1.id = 101;
        s1.name = "Blue Moon";
        s1.age = 22;

        // Creating second object
        Instance_Variables s2 = new Instance_Variables();
        s2.id = 102;
        s2.name = "Zakir";
        s2.age = 25;

        // Displaying both students' details
        s1.displayDetails();
        s2.displayDetails();
    }
    
    // Method to display details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
}

/**
 * Definition: Declared inside a class but outside any method, and belong to an object (instance of the class).
 * What is an Instance Variable in Java?

An instance variable is a variable declared:
👉 Inside a class,
👉 Outside any method, constructor, or block,
👉 And it belongs to an object (each object has its own copy).
 * 
 * 
 * 
🧠 Key Points
Declared inside class but outside methods.
Created when an object is created (using new).
Destroyed when the object is destroyed.
Each object gets its own copy (different values possible).
**/


