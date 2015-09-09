package program4;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	
	static void factorial(int num)
	{
		for(int i=1;i <= num;i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial :" +fact);
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int number = input.nextInt();
		
		factorial(number);
	}
	

}
