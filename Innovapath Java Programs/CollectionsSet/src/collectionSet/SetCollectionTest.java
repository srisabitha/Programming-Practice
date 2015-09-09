package collectionSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SetCollectionTest {

  @Test
  public void findDuplicatesTest() {
	  
	  String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
	  
	  List<String> expected = new ArrayList<String>(Arrays.asList(
			  new String[]{"xyz"}));
	  ArrayList<String> actual = SetCollection.findDuplicates(strArray);
    Assert.assertEquals(actual, expected);
  }
}
