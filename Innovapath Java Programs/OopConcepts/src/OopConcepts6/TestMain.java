package OopConcepts6;

public class TestMain {
	
	public static void main(String args[]){
		
		double radius = 5;
		Shape s = new Circle(radius);
		
		double areaResult = s.calculateArea();
		double perimeterResult = s.calculatePerimeter();
		
		System.out.println("Area:  "+areaResult +"Perimeter:  " +perimeterResult);
		
	}
	

}
