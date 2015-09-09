package Reverse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {

  @Test
  public void reverseTest() {
	  
	 String str = "This was a string";
	  String expected = "gnirts a saw sihT";
	  String actual = ReverseString.reverse(str);
	  Assert.assertEquals(expected,actual);
	  
   
  }
}
