package WordSearch23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordSearchTest {

  @Test
  public void count() throws FileNotFoundException {
	  File file = new File("sample.txt");
		Scanner scan = new Scanner(file);
		
    int expected = 1;
    int actual = WordSearch.count(scan);
    Assert.assertEquals(actual, expected);
	  
  }
}
