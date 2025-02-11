package yaip5;

public class Cylinder {
	
		   private Circle base;   // Base circle, an instance of Circle class
		   private double height;
		   
		   
		public Cylinder(Circle base, double height) {
			this.base = base;
			this.height = height;
		}
		
		public Cylinder(double radius,String color,double height) {
			this.base=new Circle(radius,color);
			this.height=height ;
		}


		@Override
		public String toString() {
			return "Cylinder [base=" + base + ", height=" + height + "]";
		}
		   
		public static void main (String[] args) {
			Cylinder cy3= new Cylinder(20,"bleu",1);
			Circle c1 = new Circle(2,"rouge");
			Cylinder cy2 = new Cylinder (c1,10) ;
			System.out.println(c1);
			System.out.println(cy3);
		}
}
