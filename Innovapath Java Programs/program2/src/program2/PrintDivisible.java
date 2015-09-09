package program2;

import java.util.Scanner;

public class PrintDivisible {
	
	public static String divisibleBy3(int number){
		
		 if(number % 3 == 0 && number % 5 == 0){
				
				return"ping pong";
			}
         
		
		else if(number % 5 == 0){
			
			return "ping";
			
		}
		else if(number % 3 == 0){
       	 
			return "pong";
		}
		else {
			return String.valueOf(number);
			
		}
		
		
	}
	
	
public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter the number");
		int number = input.nextInt();
		
		    String result = divisibleBy3(number);
		    System.out.println(result);
			
		}
		
		
		
	}
	


