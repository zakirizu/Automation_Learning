package oops_Concepts;
public class Polymorphism_MethodOverLoading {
	public static void main(String[] args) {
		Polymorphism_MethodOverLoading obj = new Polymorphism_MethodOverLoading();
		//obj.addition(10);
		//main(10);
		main("Zakir");
		main(10, 12);	
	}
	
	public static void main(int a) {
		System.out.println(a);	
	}
	
	public static void main(int a, int b) {
		System.out.println(a+b);	
	}
	
	public static void main(String x) {
		System.out.println(x);	
	}
		
	public void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addidtion of 2 numbers "+sum);
	}
	
	public void addition(int a) {
		System.out.println(a+10);
	}
	
	public void addition(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Addidtion of 3 numbers "+sum);
	}
		
	public void addition(String  x, String y) {
		System.out.println(x+" "+y);
	}
}

//It happens within the same class
//Method name should be same
//Count or Type of the parameters that method is accepting should be different
//Based upon the parameters we pass that method will be called