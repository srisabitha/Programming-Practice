package collectionSet;

import java.util.ArrayList;
import java.util.HashSet;


public class SetCollection {
	
	public static ArrayList<String> findDuplicates(String[] strArray1){
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> duplicates = new ArrayList<String>();

        for (String arrayElement : strArray1)
        {
            if(!set.add(arrayElement))
            {
                duplicates.add(arrayElement);
            }
        }
		
		return duplicates;
	}
	
	public static void main(String args[]){
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
		ArrayList<String> catchDuplicates = SetCollection.findDuplicates(strArray);
		for (String str : catchDuplicates) {
            System.out.println("Duplicate Element is : "+ str);
		}
		
	}

}
