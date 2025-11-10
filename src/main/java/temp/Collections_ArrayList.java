package temp;

import java.util.ArrayList;

public class Collections_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");
		
		int lenghth = list.size();
		System.out.println("Length of the ArrayList: " + lenghth);
		
		System.out.println(list.get(3));
		
		System.out.println(list);
		
		for(String lang : list) {
			System.out.println(lang);
		}
		

	}

}
