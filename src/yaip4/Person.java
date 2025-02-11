package yaip4;

public class Person {
	private String name ; 
	private String address ;
	
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	public static void main (String[] args) {
		Person mapers = new Person ("lili","fuveau");
		System.out.println(mapers);
		
	}
	
}
