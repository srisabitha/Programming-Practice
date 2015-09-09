package OopConcepts6;

public class Circle extends Shape implements ShapeConstant {

	private double radius;
	
	Circle(int sides){
		sides = 1; 
	}  
	
	public Circle(double radius) {
        this.radius = radius;
    }
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return PI * Math.pow(radius,2);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 *  PI * radius;
	}

	
	

}
