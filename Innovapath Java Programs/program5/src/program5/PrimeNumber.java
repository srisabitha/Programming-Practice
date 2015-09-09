package program5;

import java.util.Scanner;

public class PrimeNumber {
	
	static int number;
	static int i=2;
	
	static boolean isPrime(int number){
		for(i=2;i<=number/2;i++){
			
			if(number % i == 0){
				return false;
				
			}
		
		}
		return true;
		
	}
	
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		if(isPrime(num)==true)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
		
	}

}
