package arraylist.dog;

public class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name + ", " + type;
	}

}
