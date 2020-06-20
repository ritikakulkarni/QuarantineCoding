
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.*; 

class ArrayListAndMap { 
	public static void countFrequencies(ArrayList<String> list) 
	{ 
		// hashmap to store the frequency of element 
		Map<String, Integer> hm = new HashMap<String, Integer>(); 

		for (String i : list) { 
			Integer j = hm.get(i); 
			hm.put(i, (j == null) ? 1 : j + 1); 
		} 

		// displaying the occurrence of elements in the arraylist 
		for (Map.Entry<String, Integer> val : hm.entrySet()) { 
			System.out.println("Element " + val.getKey() + " "
							+ "occurs"
							+ ": " + val.getValue() + " times"); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Ritika"); 
		list.add("Kulkarni"); 
		list.add("Ritika"); 
		countFrequencies(list); 
	} 
} 
