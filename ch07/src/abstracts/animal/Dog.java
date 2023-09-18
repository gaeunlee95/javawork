package abstracts.animal;

public class Dog extends Animal {
	public Dog() {
		this.kind = "개";
		System.out.println(kind);
	};
	
	@Override
	public void sound() {
		System.out.println("멍~멍!");
	}

}
