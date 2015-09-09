package program9;

import org.testng.annotations.Test;
import org.testng.Assert;

public class MaxArrayTest {
	
  @Test
  public void testFindMax() {
	  
	 
	  int [] arr = {7,25,6, 10,8,5,9,11,15,};
	  
	  int expected = 25;
	  int actual = LargestNumberArray.findMax(arr);
	  Assert.assertEquals(actual,expected);
	  
	  
	  
  }
}
