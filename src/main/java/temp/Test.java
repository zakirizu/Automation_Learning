package temp;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "shaikjakirhussainaabzzzzzxxxxxxyyyyyyqqqqqddceddddffff";
		
		HashSet<Character> hset = new HashSet<>();
		
		for(int i=0; i<str.length();i++)
		{
			char temp = str.charAt(i);
			hset.add(temp);
		}
		
		System.out.println(hset);
		

	}

}
