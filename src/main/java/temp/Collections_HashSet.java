package temp;

import java.util.HashSet;

public class Collections_HashSet {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("Java");
	set.add("Python");
	set.add("C++");
	set.add("JavaScript");
	
	System.out.println(set);
	
	for(String lang : set) {
		System.out.println(lang);
	}
	}
}
