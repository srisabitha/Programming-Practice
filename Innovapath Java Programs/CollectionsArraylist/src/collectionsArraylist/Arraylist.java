package collectionsArraylist;

import java.util.ArrayList;
import java.util.ListIterator;


public class Arraylist {

	/**
	 * @param a1
	 * 
	 * @return
	 */
	public static ArrayList<String> addElement(ArrayList<String> a1){

		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");

		return a1;
	}
	
	public static void print(ArrayList<String> a1){
		ListIterator i1;
		
		i1 = a1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
	
	
   public static void printReverse(ArrayList<String> a1){
	   ListIterator i1;
		
		i1 = a1.listIterator(a1.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
	}

	
	/**
	 * @param a1
	 * @param search
	 * 
	 * @return
	 */
	public static String searchList(ArrayList<String> a1,String search){

		for(String str : a1) {
			if(str.compareTo(search) == 0) {
				System.out.println("item found");
			}
		
		}
		return search;
	}


	public static void main(String args[]){
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2 =  addElement(a2);
		searchList(a2,"one");
		print(a2);
		printReverse(a2);
	}
}
