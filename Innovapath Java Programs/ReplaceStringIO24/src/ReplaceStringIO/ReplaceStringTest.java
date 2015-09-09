package ReplaceStringIO;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceStringTest {

  @Test
  public void replace() throws IOException {
   
	  
	  String expected = "My name is Sri.";
	  String actual = ReplaceString.replace();
	  Assert.assertEquals(actual, expected);
	  
	  
  }
}
