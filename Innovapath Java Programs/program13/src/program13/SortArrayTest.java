package program13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

  @Test
  public void sortTest() {
	  
       int n=3;
       int array[]={4,3,1};
       
	  int[] expected = new int[] {1,3,4};
	  int [] actual = SortArray.sort(array,n);
	  Assert.assertEquals(expected,actual);
	  
	  
  }
}
