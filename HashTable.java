/*Program representing a Hash Table
*/

import java.util.*;

public class HashTable {
	public static void main(String[] args) {
		HashMap<String,String> pb = new HashMap<String,String>();
	
		//Adding elements
		pb.put("Andrew","1234");
		pb.put("Andy","1564");
		pb.put("Bred","1094");
	
		//Size
		System.out.println("Size of hashmap is " + pb.size());
		
		//Iterating
		for(Map.Entry contact: pb.entrySet()) {
			System.out.println(contact.getKey() + " " + contact.getValue());
		}

		//Searching
		String key = "Andy";
		System.out.println("Andy's number is: " + pb.get(key));

		System.out.println(pb.containsKey(key));
		
		//Removing a key
		pb.remove(key);
		System.out.println("After removing Andy");
		for(Map.Entry contact: pb.entrySet()) {
			System.out.println(contact.getKey() + " " + contact.getValue());
		}		
	}
}