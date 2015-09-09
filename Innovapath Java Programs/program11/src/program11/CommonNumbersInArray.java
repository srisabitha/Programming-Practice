package program11;

public class CommonNumbersInArray {
	
	public static int[] common(int[]arr1 , int[]arr2){
		int[] arr3 = new int[2]; int k=0;
		
		for(int i=0; i<arr1.length; i++){
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					arr3[k] = arr1[i];
					k++;
				}
			}
		}
		return arr3;
	}
	
	
	public static void main(String args[]){
		int array1[] = {3,8,5,4,2};
		int array2[] = {9,1,0,4,1,8};
		int array3[] = common(array1, array2);
		
		for (int elem : array3) {
			System.out.println(elem);
		}
	}
}
