package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog인스턴스 4개를 생성해서 배열에 저장하고
		// 정보를 출력하세요.
		
		Dog[] d = new Dog[4];
		
		//배열에 저장(입력)
		d[0] = new Dog("하나", "푸들");
		d[1] = new Dog("둘", "비숑");
		d[2] = new Dog("셋", "진돗개");
		d[3] = new Dog("넷", "시츄");
		
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i].getName() + 
					", " + d[i].getType());
		}
		
//		Dog[] d = {
//				new Dog("하나", "푸들"),
//				new Dog("둘", "비숑"),
//				new Dog("셋", "진돗개"),
//				new Dog("넷", "시츄")
//		};
//		
//		for(int i=0; i<d.length; i++) {
//			System.out.println(d[i].getName() + 
//					", " + d[i].getType());
//		}
		
		System.out.println("======================================");
		
		//향상된 for문
		for(Dog dogs : d) {
			System.out.println(dogs.getName() + ", " + dogs.getType());
		}
		
	}
	
}	
