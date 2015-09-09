package FileIO;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileIOTest {



  @Test
  public void multiply() {
	  
	  InputStream fstream = new ByteArrayInputStream("3\n4".getBytes());
	  BufferedInputStream br = new BufferedInputStream(fstream);
	  DataInputStream dis = new DataInputStream(br);
	  
	  int expected = 12;
	  int actual = FileIO.multiply(dis);
	  System.out.println(actual);
	  Assert.assertEquals(actual, expected);
  }
}
