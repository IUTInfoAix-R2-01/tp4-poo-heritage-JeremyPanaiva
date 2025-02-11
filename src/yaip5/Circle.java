package yaip5;

public class Circle {
	double radius ;
	String color  ;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	public static void main (String[] args) {
		Circle c1 = new Circle(2,"rouge") ;
		System.out.println(c1);
	}
	
}
