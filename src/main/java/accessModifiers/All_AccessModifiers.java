package accessModifiers;
public class All_AccessModifiers {

	public static void main(String[] args) {
		
	
	}

	public static void publicMethod() {
		System.out.println("This is a public method.");
	}
	
	private static void privateMethod() {
		System.out.println("This is a private method.");
	}
	
	protected static void protectedMethod() {
		System.out.println("This is a protected method.");
	}
	
	static void defaultMethod() {
		System.out.println("This is a default method.");
	}

}


/**
--Access Modifiers Matrix in Java

AccessModifier			Within Same Class	Within Same Package(DifferentClass)		Subclass in Different Package		Other Packages (Non-Subclass)	Can Apply To
public					✅ Accessible		✅ Accessible							✅ Accessible						✅ Accessible					Classes, Methods, Variables, Constructors
protected				✅ Accessible		✅ Accessible							✅ Accessible(throughInheritance)	❌ Not Accessible				Methods, Variables, Constructors
default (no keyword)	✅ Accessible		✅ Accessible							❌ Not Accessible					❌ Not Accessible				Classes, Methods, Variables, Constructors
private					✅ Accessible		❌ Not Accessible						❌ Not Accessible					❌ Not Accessible				Methods, Variables, Constructors




🔸 Types of Access Modifiers There are 4 access modifiers in Java:
public					Accessible from anywhere	Classes, Methods, Variables, Constructors
protected				Accessible within same package and by subclasses	Methods, Variables, Constructors
default (no keyword)	Accessible only within same package	Classes, Methods, Variables, Constructors
private					Accessible only within the same class	Methods, Variables, Constructors
**/