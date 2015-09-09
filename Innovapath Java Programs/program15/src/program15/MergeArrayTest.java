package program15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeArrayTest {

  @Test
  public void mergeTest() {
	  
	  int array1[] = {1,2,5};
		int array2[] = {3,7};
	  
	  int[] expected = new int[] {1,2,3,5,7};
	  int[] actual = MergeArray.merge(array1,array2);
	  Assert.assertEquals(expected,actual);
	  
	  
	  
	  
  }
}
