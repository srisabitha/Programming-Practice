package ParanthesisCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParanthesisCheckTest {

  @Test
  public void isBalancedtest() {
    String str = "[{}]";
    boolean expected = true;
    boolean actual = ParanthesisCheck.isBalanced(str);
    Assert.assertEquals(actual, expected);
	  
	  
  }
  @Test
  public void isBalancedtest1() {
    String str = "[{";
    boolean expected = false;
    boolean actual = ParanthesisCheck.isBalanced(str);
    Assert.assertEquals(actual, expected);
	  
	  
  }
}
