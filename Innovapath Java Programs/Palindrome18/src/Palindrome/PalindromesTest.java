package Palindrome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromesTest {

  @Test
  public void isPalindrometest() {
  
	  
	  String str = "mom";
	  boolean expected = true;
	  boolean actual = Palindromes.isPalindrome(str);
	  Assert.assertEquals(expected,actual);
	  
  }

  @Test
  public void isPalindrometest1() {
  
	  
	  String str = "daddy";
	  boolean expected = false;
	  boolean actual = Palindromes.isPalindrome(str);
	  Assert.assertEquals(expected,actual);
	  
  }
}
