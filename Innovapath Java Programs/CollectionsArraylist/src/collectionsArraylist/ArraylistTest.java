package collectionsArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraylistTest {

  @Test
  public void addElement() {
	  ArrayList<String> actual = new ArrayList<String>();
	  List<String> expected = new ArrayList<String>(Arrays.asList(
			  new String[]{"one","two","three","four"}));
	  
	  actual = Arraylist.addElement(actual);
	  boolean equalLists = expected.size() == actual.size() && expected.containsAll(actual);
	  System.out.println(equalLists);
	  
	  Assert.assertEquals(actual, expected);
  }
 

  @Test
  public void testSearchList() {
	  
	  ArrayList<String> a1 = new ArrayList<String>();
	  String expected = "one";
	  String actual = Arraylist.searchList(a1, "one");
      Assert.assertEquals(actual, expected);
  }
}
