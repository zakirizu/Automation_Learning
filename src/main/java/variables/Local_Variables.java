package variables;

public class Local_Variables {

	public static void main(String[] args) {
		Local_Variables obj = new Local_Variables();
		  obj.displayMessage();
	      obj.calculateSum();
	}
	
    public void displayMessage() {
        // local variable
        String message = "Hello, Blue Moon!";  
        // using local variable
        System.out.println(message);  
    }
        
     public void calculateSum() {
            // local variables
            int a = 10;
            int b = 20;
            int sum = a + b;
            System.out.println("Sum of a and b is: " + sum);
        }
}
/** Local Variables: A local variable in Java is a variable declared inside a method. Or Inside a constructor
    ********** Key Points *************
	Declared inside a method, constructor, or block.
	Must be initialized before use (Java doesn’t assign default values).
	Scope is limited to the block in which it is declared.
	Memory is allocated when the method is called and released when it exits.
 **/

/***Explanation:
	 message(variable declared in the  dispayMessage method), a, b, and sum are local variables because they are declared inside methods.
	 They cannot be accessed outside their respective methods.
	 For example, trying to print message inside calculateSum() will cause a compile-time error.
***/



