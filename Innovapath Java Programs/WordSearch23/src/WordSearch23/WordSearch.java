package WordSearch23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	public static void main(String args[]) throws FileNotFoundException{
		File file = new File("sample.txt");
		Scanner sc = new Scanner(file);
		int result = count(sc);
		System.out.println("Number of occurence is: " + result);

	}
		
		public static int count(Scanner sc) throws FileNotFoundException{
			
			int count=0;
			while(sc.hasNext()){
				String nxt = sc.next();
				if(nxt.equals("Sabitha") ){
					count++;
				}
				
		}
			return count++;
		
	}
	
	
		public static int countWord() throws FileNotFoundException{
			File file = new File("sample.txt");
			Scanner sc = new Scanner(file);
			int count=0;
			
			while(sc.hasNext()){
				String str = sc.next().replace(".", "");
				if(str.compareToIgnoreCase("Sabitha") == 0){
					count++;
				}	
			}
			return count++;
		}
}
