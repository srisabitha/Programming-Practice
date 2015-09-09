package ListFiles;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListFilesTest {

  @Test
  public void list() {
    
	  File file = new File("/Users/sabitha/documents/workspace/example1");
      File[] expected = file.listFiles();
	  File[] actual = ListFiles.list();
	  Assert.assertEquals(actual, expected);
	  
	  
  
}
}
