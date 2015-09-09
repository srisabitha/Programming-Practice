package program3;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	
	

	    public static int[] swap(int num1,int num2){
	    	num1 = num1 + num2;
	    	num2 = num1 - num2;
	    	num1 = num1 - num2;
	    	return (new int[] {num1, num2});
	    }
	    
	    static int[] swap2(int num1,int num2){
	    	int temp = num1;
	    	num1 = num2;
	    	num2 = temp;
	    	return (new int[] {num1, num2});
	    }
	
	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the numbers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("The numbers before swap: num1="+n1 +"num2="+n2);
		
		int[] swapa = swap(n1,n2);
		System.out.println("The numbers after swap: num1=  "+swapa[0] +"num2=  "+swapa[1]);
		int[] swapb = swap2(n1,n2);
		System.out.println("The numbers after swap: num1=  "+swapb[0] +"num2=  "+swapb[1]);
		
		
	}
	
	

}
