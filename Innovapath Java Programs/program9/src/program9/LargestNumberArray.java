package program9;

public class LargestNumberArray {
	
	
	
	public static int findMax(int[] arr){
		
		int temp = arr[0];
		  
		  for(int i=1;i<arr.length;i++){
			  if(arr[i] > temp)
			  {
				  temp = arr[i];
				  
		  }
			 
		
	}
		  return temp;
	}
	
	
	
	
	}
	
