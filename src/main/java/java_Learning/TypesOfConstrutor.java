package java_Learning;

public class TypesOfConstrutor {

	public static void main(String[] args) {
	
		TypesOfConstrutor obj = new  TypesOfConstrutor();//Calling the constructor
		TypesOfConstrutor obj1 = new TypesOfConstrutor(36,"Zakir");//Calling the parameterized constructor
		TypesOfConstrutor obj4 = new TypesOfConstrutor(36, "Zakir", 75000.50);//Calling the parameterized constructor
		}
	
	//Non-Parameterized Constructor
	public TypesOfConstrutor() {
		System.out.println("Default constructor");
	}
	
	public TypesOfConstrutor(int age, String name, double salary) {
		System.out.println("Parameterized Constructor: " + age + " " + name + " " + salary);		
	}
	
	//Parameterized Constructor
	public TypesOfConstrutor(String name) {
		System.out.println("Parameterized Constructor: " + name);
	}
	
	//Parameterized Constructor
	public TypesOfConstrutor(int age) {
		System.out.println("Parameterized Constructor: " + age);
	}
	
	public TypesOfConstrutor(int age, String name) {
		System.out.println("Parameterized Constructor: " + age + " " + name);		
	}

}
