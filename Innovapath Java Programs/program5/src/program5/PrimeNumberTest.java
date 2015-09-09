package program5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumberTest {

  @Test
  public void testIsPrime() {
	  
    boolean expected = true;
    int number = 7;
    boolean actual = PrimeNumber.isPrime(number);
    Assert.assertEquals(actual, expected);
  }
}
