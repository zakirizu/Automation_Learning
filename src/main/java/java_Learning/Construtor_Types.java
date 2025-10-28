package java_Learning;

public class Construtor_Types {

	public static void main(String[] args) {
	
		Construtor_Types obj = new  Construtor_Types();//Calling the constructor
		Construtor_Types obj1 = new Construtor_Types(36,"Zakir");//Calling the parameterized constructor
		Construtor_Types obj4 = new Construtor_Types(36, "Zakir", 75000.50);//Calling the parameterized constructor
		}
	
	//Non-Parameterized Constructor
	public Construtor_Types() {
		System.out.println("Default constructor");
	}
	
	public Construtor_Types(int age, String name, double salary) {
		System.out.println("Parameterized Constructor: " + age + " " + name + " " + salary);		
	}
	
	//Parameterized Constructor
	public Construtor_Types(String name) {
		System.out.println("Parameterized Constructor: " + name);
	}
	
	//Parameterized Constructor
	public Construtor_Types(int age) {
		System.out.println("Parameterized Constructor: " + age);
	}
	
	public Construtor_Types(int age, String name) {
		System.out.println("Parameterized Constructor: " + age + " " + name);		
	}

}
