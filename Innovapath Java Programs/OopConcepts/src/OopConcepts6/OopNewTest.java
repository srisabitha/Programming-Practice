package OopConcepts6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OopNewTest {
	
	double radius = 5;
	Shape s = new Circle(radius);
  @Test
  public void testCalculateArea() {
	  
	  double expected = 78.5;
	  double actual = s.calculateArea();
	  Assert.assertEquals(actual,expected);
	  
  }
  
  @Test
  public void testCalculatePerimeter() {
	  
	  double expected = 31.400000000000002;
	  double actual = s.calculatePerimeter();
	  Assert.assertEquals(actual,expected);
	  
  }
  
}
