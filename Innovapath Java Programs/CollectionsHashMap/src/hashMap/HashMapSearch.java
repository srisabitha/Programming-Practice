package hashMap;

import java.util.HashMap;

public class HashMapSearch {
	public static  HashMap<Integer, String> addElement(HashMap<Integer, String>  map1){
		map1.put(21, "Twenty One");
		map1.put(22, "Twenty two");
	   return map1;
	}
	public static String searchElement(HashMap<Integer, String>  map1,Integer key1){
		
		String value = map1.get(key1); 
		System.out.println("Key: " + key1 +" value: "+ value); 
        return value;
		
	}
	
	
	public static void main(String args[]){
		
	HashMap<Integer, String>  map2 = new HashMap<Integer, String>();
	map2= addElement(map2);
	String r = searchElement(map2,21);
	System.out.println(r);
}
}
