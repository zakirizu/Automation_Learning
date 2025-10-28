package variables;

public class All_variable_Types {	
	//Instance Variable
	int a = 10;
	int b = 5;
	
	//Static Variable
	static int x = 20;
	static int y = 2;
	
	public static void main(String[] args) {
		All_variable_Types mathsOpertaions = new All_variable_Types();
		mathsOpertaions.addition();
		mathsOpertaions.subtraction();
		mathsOpertaions.multiplication();
		division();
	}
	
	public static void division() {
		int div = x/y;
		System.out.println("Division :"+div);//10
	}
	
	public void addition() {
		//Local Variables 
		int  a =10 ;
		int  b =5 ;		
		int sum = a + b;		
		System.out.println("Sum: " + sum);//15
	}
	
	public void subtraction() {
		int difference = a - b;
		System.out.println("Subraction: " + difference);//5
	}
	
	public void multiplication() {
		int product = a * b;
		System.out.println("Product: " + product);//50
	}
}
