package arraylist.shape;

import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Triangle");
	}

}

public class ShapeTest {
	
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		
		//list에 객체 저장
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		//1개 출력
		(list.get(0)).draw();

		System.out.println("================");
		
		//for(자료형 변수 : 리스트이름){}
		for(Shape s : list) {
			s.draw();
		}
		
		
		
	}

}
