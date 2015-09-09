package program1;

import java.util.Scanner;

public class FibonacciSeries {
	
	 	 static int n1=0, n2=1, n3=0;  
	 	 
		 public static int printFibonacci(int count){  
			 
		    if((count == 0 )|| (count == 1))
		    	return count;
		    else
		    	return printFibonacci(count-1) + printFibonacci(count-2);
		 }    
		 public static void main(String args[]){    
		  
			 Scanner input = new Scanner(System.in);
			 
			 System.out.println("Please enter the count");
		     int count = input.nextInt();
		  
		  for(int i=0;i <= count ;i++){
			  System.out.print(" "+printFibonacci(i));
		  }
		  
		  
		 }  
		}  


