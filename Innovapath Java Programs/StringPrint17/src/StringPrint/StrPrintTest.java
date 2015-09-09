package StringPrint;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StrPrintTest {

  @Test
  public void printstr() {
	  
	  String str = "This is nice";
    
	  String actual = "This1 is2 nice3";
	  String expected = StrPrint.printstr(str);
	  Assert.assertEquals(expected,actual);
	  
	  
  }
}
