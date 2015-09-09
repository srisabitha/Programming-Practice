package program11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonNumbersInArrayTest {

  @Test
  public void commonTest() {
	  
	  int array1[] = {3,8,5,4,2};
	  int array2[] = {9,1,0,4,1,8};
	  
	  int[] expected = {8,4};
	  int[] actual = CommonNumbersInArray.common(array1, array2);
      Assert.assertEquals(actual, expected);
  }
}
