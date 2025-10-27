package java_Learning;

public class TypesOfOperators {

	public static void main(String[] args) {
		TypesOfOperators obj = new TypesOfOperators();
		obj.UnaryOperators();
	}
	
	public  void UnaryOperators() {
		
		int x = 5;
		//++ -> Increment Operator 
			//Pre Increment ++x
			//Post Increment x++
		System.out.println(++x);//6
		System.out.println(x++);//11 -> 12
		System.out.println(x);//12
		System.out.println(--x);//11
		System.out.println(x);//11
		System.out.println(x--);//11 -> 10
		//-- -> Decrement OperatorQ
			//Pre Decrement  --x
			//Post Decrement x--

		
		
	}

}
