package java_Learning;
public class ReturnType {
	public static void main(String[] args) {
		int total = addition();
		String x = myName();
		char z = myGender();
		int sumOftw0 = additionOfTwoNumbers(5,15);
		int[] arr = arrayReturn();		
		System.out.println(total);
		System.out.println(x);
		System.out.println(z);
		System.out.println(sumOftw0);
	}
//AccessModifier static/NonStatic ReturnType MethodName()  {}
	public static int addition() {
		int  sum = 10+20;
		return sum;		
	}
	
	public static String myName() {
		String name = "Zakir";
		return name;
	}
	
	public static String myCity() {
		return "Kurnool";
	}
	
	public static char myGender() {
		return 'M';
	}
	
	public static int additionOfTwoNumbers(int p, int q) {
		int sum = p+q;
		return sum;
	}
	
	public static int[] arrayReturn() {
		int[] x = {2,3,4};
		return x;		
	}

}
