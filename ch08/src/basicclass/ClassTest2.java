package basicclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		
		System.out.println("===== 클래스의 이름 출력하기 =====");
		//Class<?> class1 = person.getClass();
		Class<?> class1 = Class.forName("basicclass.Person");
		System.out.println(class1.getName());
		
		System.out.println("===== 클래스의 필드(멤버변수) 출력하기 =====");
		Field[] fields = class1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		System.out.println("===== 생성자 정보 출력하기 =====");
		Constructor<?>[] cons = class1.getConstructors();
		for(Constructor<?> con : cons){
			System.out.println(con);
	
		}
		
		System.out.println("===== 메서드 정보 출력하기 =====");
		Method[] methods = class1.getMethods();
		for(Method method : methods)
			System.out.println(method);
		
	}

}
