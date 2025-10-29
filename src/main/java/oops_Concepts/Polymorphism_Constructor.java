package oops_Concepts;

public class Polymorphism_Constructor {

	public static void main(String[] args) {
		Polymorphism_Constructor obj =  new Polymorphism_Constructor();
		Polymorphism_Constructor obj1 = new Polymorphism_Constructor("Bluestone");
		Polymorphism_Constructor obj2 = new Polymorphism_Constructor(10, 12);
		}
	
	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of 2 "+sum);
	}
	
	public void addition(int a) {	
		System.out.println("Sum of 1 "+a);
	}
	
	public Polymorphism_Constructor() {
		System.out.println("This is a Non-Param constrcutor");
	}
	
	public Polymorphism_Constructor(int x, int y)
	{
		System.out.println("This is a Param constrcutor with Two Ints");
		System.out.println(x +" "+y);
	}
	
	public Polymorphism_Constructor(String p)
	{
		System.out.println("This is a Param constrcutor with Single String");
		System.out.println(p);
	}

}
