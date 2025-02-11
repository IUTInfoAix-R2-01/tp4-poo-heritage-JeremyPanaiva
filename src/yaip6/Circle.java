package yaip6;

public class Circle implements GeometricObject {
	double radius ;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	

}
