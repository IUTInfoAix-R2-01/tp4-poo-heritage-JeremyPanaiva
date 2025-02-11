package yaip6;

public class Rectangle implements GeometricObject {
		double witdh ; 
		double length ;
		
		@Override
		public String toString() {
			return "Rectangle [witdh=" + witdh + ", length=" + length + "]";
		}

		public Rectangle(double witdh, double length) {
			super();
			this.witdh = witdh;
			this.length = length;
		}
		
		    
		    @Override
		    public double getArea() {
		        return witdh * length; 
		    }
		    
		    @Override
		    public double getPerimeter() {
		        return 2 * (witdh + length);
		    }
}
