package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		//자료 저장
		queue.enQueue("수박");
		queue.enQueue("배");

		//자료 삭제(출력)
		System.out.println(queue.deQueue()); // 인덱스 0번의 "수박" 출력 및 삭제
		System.out.println(queue.deQueue()); // 인덱스 0번의 "배" 출력 및 삭제
		System.out.println(queue.deQueue()); 
	}

}
