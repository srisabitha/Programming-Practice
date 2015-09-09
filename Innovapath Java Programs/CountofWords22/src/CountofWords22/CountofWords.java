package CountofWords22;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class CountofWords {
	
	public static void main(String args[]) throws FileNotFoundException{
		
	int result = count();
	System.out.println("Number of words: " + result);

}
	
	public static int count() throws FileNotFoundException{
		File file = new File("sample.txt");
		Scanner sc = new Scanner(file);
		int count=0;
		while(sc.hasNext()){
		    sc.next();
		    count++;
		
	}
		return count++;
	
}
}
