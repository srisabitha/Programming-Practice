package hashMap;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashMapSearchTest {

  @Test
  public void addElementTest() {
	  HashMap<Integer, String>  map2 = new HashMap<Integer, String>();
	 // Map<String, Integer> expected = ImmutableMap.of("a", 1, "b", 2, "c", 3);
	  
	  HashMap<Integer, String> expected = new HashMap<Integer, String>(){{put(21,"Twenty One");
	                                                                      put(22,"Twenty two");}};
	  HashMap<Integer, String> actual = HashMapSearch.addElement(map2);
	  Assert.assertEquals(actual, expected);
  }

  @Test
  public void searchElementTest() {
	  String expected = "Twenty One";
	  HashMap<Integer, String>  map2 = new HashMap<Integer, String>();
	  String actual = HashMapSearch.searchElement(map2, 21);
      Assert.assertEquals(actual, expected);
  }
}
