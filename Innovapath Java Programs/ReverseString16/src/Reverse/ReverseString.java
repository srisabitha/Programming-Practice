package Reverse;

public class ReverseString {
	
	public static String reverse(String str){
		
		char[] actualChars = str.toCharArray();
		char[] reverseChars = new char[actualChars.length];
		
		for(int i=0; i < actualChars.length; i++){
			reverseChars[i] = actualChars[(actualChars.length-1)-i];
			
			
		}
		String rev = new String(reverseChars);
		
		return rev;
	}
	
	public static void main(String args[]){
		
		String str = "This was a string";
		
		
		String rev = reverse(str);
		
		System.out.println("the reverse string is :  " +rev);
		
	}
	
	

}
