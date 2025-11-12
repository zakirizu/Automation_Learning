package java_Learning;

import java.util.ArrayList;

public class ArrayList_Java {

	public static void main(String[] args) {
		//Syntax to create an ArrayList
		ArrayList<String> alist = new ArrayList<>();
		
		//Adding Values to the ArrayList
		alist.add("Apple");
		alist.add("Boy");
		alist.add("Cat");
		alist.add("Dog");
		
		//Direclty Printing the ArrayList
		System.out.println(alist);
		
		//Getting the size of ArrayList
		int length = alist.size();
		System.out.println("Size of the ArrayList is "+length);
		
	   //Using for each loop for getting the values from Arraylist
		for(String x : alist) {
			System.out.println(x);			
		}
		
		//Printing the values at the required index
		System.out.println();
		String temp = alist.get(3);
		System.out.println("Priting by Giving the Index "+temp);
		

	}

}
