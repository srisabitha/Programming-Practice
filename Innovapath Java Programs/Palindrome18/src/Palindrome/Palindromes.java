package Palindrome;

import java.util.Scanner;

public class Palindromes {
	
	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string");
		String str = input.nextLine();
		
		if(isPalindrome(str)){
			System.out.println("the string is palindrome");
			
		}
		else{
			System.out.println("the string is not palindrome");
		}
	
	}
	
	public static boolean isPalindrome(String str){
		
		int low = 0;
		int high = str.length() - 1;
		
		while(low < high){
			if(str.charAt(low) != str.charAt(high))
				return false;
			
			low++;
			high--;
			
		}
		
		return true;
		
		
	}
		
		
	
	

}
