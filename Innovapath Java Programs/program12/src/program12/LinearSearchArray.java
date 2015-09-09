package program12;

import java.util.Scanner;

public class LinearSearchArray {
	
	
	
	
	public static void main(String args[]){
		
		int array[] = {4 ,5 ,7, 3, 1, 9};
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number to search");
		int number = input.nextInt();
		
		for(int i=0;i<array.length;i++){
			
			if(number == array[i])
				System.out.print("the number "+number + "is in the array at index" +i);
		
			
		}
		input.close();
		
		
	}
	
	
	

}
