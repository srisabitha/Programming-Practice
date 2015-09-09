package EqualsFunction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualsFunctionTest {

  @Test
  public void check() {
	  
	  String str1 = new String("Welcome to java");
	  String str2 = "Welcome to java";
	  boolean expected = true;
	  boolean actual = EqualsFunction.check(str1, str2);
	  Assert.assertEquals(expected,actual);
  }
  

  @Test
  public void hashcode() {
	  String str1 = new String("Welcome to java");
	  long expected = 72404425;
	  long actual = EqualsFunction.hashcode(str1);
	  Assert.assertEquals(expected,actual);
  }
}
