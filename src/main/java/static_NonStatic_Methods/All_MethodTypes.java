package static_NonStatic_Methods;

public class All_MethodTypes {
	//Class can have Many Methods. But Java will run the code only from Main Method
	//There are two types of Methods 
		//Static 
		//Non-Static	

	public static void main(String[] args) {	
		addition();
		//Syntax to create a Object
		//ClassName ObjecNmae = new CLassName();
		All_MethodTypes obj     = new All_MethodTypes();
		obj.subraction();
		obj.Multiply();		
	}
	
	//Static Method-> Use Static Keyword ->Call (Call Directly by name)
	public static void addition() {
		System.out.println("Static :  Addition");
	}
	
	//Non-Static Method->Do Not Use Static Keyword ->Call (Create a Object for the class->from that object call method)
	public void subraction() {
		System.out.println("Non-Static : Subraction");
	}
	
	public void Multiply() {
		System.out.println("Non-Static : Multiply");
	}
	

}
