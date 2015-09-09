package program2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  

@Test
  public void testDivisibleBy3() {
	  
	  String expected ="pong";
     String actual = PrintDivisible.divisibleBy3(9);
     Assert.assertEquals(expected,actual);
    		  
  }
@Test
public void testDivisibleBy5() {
	  
	  String expected ="ping";
   String actual = PrintDivisible.divisibleBy3(10);
   Assert.assertEquals(expected,actual);
  		  
}
@Test
public void testDivisibleBy5And3() {
	  
	  String expected ="ping pong";
   String actual = PrintDivisible.divisibleBy3(15);
   Assert.assertEquals(expected,actual);
  		  
}
}
