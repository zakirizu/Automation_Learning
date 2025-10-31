package oops_Concepts;

public class Beta_Inheritance extends Alpha_Inheritance {

	public static void main(String[] args) {
		Beta_Inheritance obj = new Beta_Inheritance();
		obj.home();//Parent->13
		obj.vehicle();//Child-16
		obj.multiplication(4,5);//child-20
	}
	
	public void home(String a) {
		System.out.println("Hyderabad");
	}
	
	public void vehicle() {
		System.out.println("Child Safari Car");		
	}
	
	public void multiplication(int b) {
		int mul = 4+4+4;
		System.out.println("Child Multiplicaiton "+mul);
		
	}

}
