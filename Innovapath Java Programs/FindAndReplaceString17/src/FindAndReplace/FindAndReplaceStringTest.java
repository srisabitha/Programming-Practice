package FindAndReplace;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAndReplaceStringTest {

  @Test
  public void replaceTest() {
	  
	  String str = "This is an actual string";
	  String oldSubStr = "actual";
	  String newSubstr = "final";
    
	 String actual = "This is an final string";
	 String expected = FindAndReplaceString.replace(str, oldSubStr,newSubstr);
	 Assert.assertEquals(expected,actual);
	  
  }
  
}
