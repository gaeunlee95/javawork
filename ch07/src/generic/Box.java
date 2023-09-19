package generic;

//제네릭 타입으로 클래스 정의
public class Box<T> {
	//필드
	private T type;
	
	//메서드
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
	
	
}
