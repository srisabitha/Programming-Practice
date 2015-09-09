package program15;



public class MergeArray {

	public static void main(String args[]){

		int array1[] = {1,2,5};
		int array2[] = {3,7};


		int[] c = merge(array1,array2);
		
		System.out.println("The merged array is:");
		for(int i=0; i<c.length;i++)
			System.out.print(" "+c[i]);
	}

	public static int[] merge(int[] a,int[] b){

		int[] c = new int[a.length + b.length];

		int k=0,i=0,j=0;
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				c[k] = a[i];
				i++;

			}
			else
			{
				c[k] = b[j];
				j++;

			}
			k++;

		}
		while(i < a.length)
		{
			c[k] = a[i];
			i++;
			k++;
		}
		while(j < b.length)
		{
			c[k] = b[j];
			j++;k++;
		}

		

		return c;
	}

	



}
