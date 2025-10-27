package java_Learning;

public class Loops_In_Java {

	public static void main(String[] args) {
		//Exactly the Count how many times you need to run he code
		//ForLoop();
		
		//WhileLoop -> If you want to run same piece of code till the condition the met
		//WhileLoop();
		
		//Do-While -> If you want to run same piece of code till the condition the met. 
		//             But this loops will Run atleast once
		DoWhileLoop();

	}


	private static void DoWhileLoop() {
		int i=7;
		do
		{
			System.out.println(i);//8
			i++;//8->9
		}
		while(i<=8); //9>=8
	}

	

	private static void WhileLoop() {
		int a =0;
		while(a<=8)//11<=8
		{
			System.out.println(a);
			a++;
		}
	}


	
	private static void ForLoop() {
		//for(intiliazie;   checktheCOndition; IncrementCoutner)
		for(int i=1; i<=8; i++)
		{
			System.out.println(i);
		}
		
	}

	

}
