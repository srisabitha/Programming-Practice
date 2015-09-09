package program3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapTwoNumbersTest {

  @Test
  public void swaptest() {
	  int[] expected = new int[] {4,2};
	  
	  int[] actual = SwapTwoNumbers.swap(2,4);
	  
	  Assert.assertEquals(expected,actual);
	  
	  
    
  }

  @Test
  public void swap2test() {
	  
        int[] expected = new int[] {4,2};
	  
	  int[] actual = SwapTwoNumbers.swap2(2,4);
	  
	  Assert.assertEquals(expected,actual);
	  
  }
}
