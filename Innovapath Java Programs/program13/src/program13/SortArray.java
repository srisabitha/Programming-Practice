package program13;

import java.util.Scanner;

public class SortArray {

    public static int[] sort(int[] array, int num){
		int temp,k = 0, j=0;
		
	for(j=0;j<num;j++){
		for( k=j+1;k<num;k++){
			if(array[j] > array[k])
			{
				temp = array[j];
				array[j] = array[k];
				array[k] = temp;
			}
	
		
	}
		
	}	
	
	
	return array;
}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int arr[] = new int[20];
		System.out.println("enter the number of elements in aray");
		int n = input.nextInt();
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}
		
		int[] a = sort(arr,n);
		
		System.out.println("the sorted list:");
		for(int j = 0;j < n;j++){
		
		System.out.println( +a[j]);
		
	}
	}
}
	

