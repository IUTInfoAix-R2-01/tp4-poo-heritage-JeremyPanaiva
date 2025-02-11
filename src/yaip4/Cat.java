package yaip4;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
	}
	
	public void greets () {
		System.out.println("Meaow");
	}

	@Override
	public String toString() {
		return "Cat ["+super.toString()+"]";
	}

	public static void main (String[] args) {
		Cat monchat= new Cat ("lili");
		System.out.println(monchat);
		monchat.greets();

		
	}
}
