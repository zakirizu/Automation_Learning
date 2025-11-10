package temp;

import java.util.HashMap;

public class Collections_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		System.out.println("HashMap: " + map);
		System.out.println("Value for key 'Two': " + map.get("Two"));
		for (String key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

	}

}
