package yaip4;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}
	
	public void greets () {
		System.out.println("wooof");
	}
	
	public void greets(Dog annother ) {
		System.out.println("wooooooooooooof");
	}

	@Override
	public String toString() {
		return "Dog []"+super.toString()+"]";
	}
	
	public static void main (String[] args) {
		Dog monchien= new Dog ("lili");
		System.out.println(monchien);
		monchien.greets(monchien);	
	}
}
