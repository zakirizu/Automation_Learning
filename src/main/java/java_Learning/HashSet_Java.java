package java_Learning;

import java.util.HashSet;

public class HashSet_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		HashSet<Integer> number = new HashSet<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		System.out.println(number);
		
		
		
		
		
		//Adding the values to the HashSet
		hset.add("Apple");
		hset.add("Boy");
		hset.add("Cat");
		hset.add("Cat");
		hset.add("Dog");
		
		//Directly Print the values from set
		System.out.println(hset);
		
		int len = hset.size();
	//FOR-EACH LOOP
		for(String temp: hset)
		{
			System.out.println(temp);
		}
		
	
		

	}

}
