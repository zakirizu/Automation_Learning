package java_Learning;

public class PassingParamtersIntoMethod {

	public static void main(String[] args) {
		PassingParamtersIntoMethod obj = new PassingParamtersIntoMethod();
		obj.addition(22,23);
		obj.myName("Zakir","Shaik");
		obj.myDetails("Zakir", 36, 'M');
	}
	
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is: " + sum);
	}
	

	public void myName(String FirstName, String LastName) {		
		String fullName = FirstName + " " + LastName;
		System.out.println(fullName);
	}
	
	public void myDetails(String Name, int age, char gender) {		
		System.out.println("Name: " + Name);
		System.out.println("Age: " + age);
		System.out.println("gender: " +gender);
	}

}
