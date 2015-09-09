package CountofWords22;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountofWordsTest {

  @Test
  public void count() throws FileNotFoundException {
	  
    int expected = 4;
    int actual = CountofWords.count();
	  
	  Assert.assertEquals(actual, expected);
	  
  }
}
