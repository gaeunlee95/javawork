package threads.threadname;

public class ThreadNameTest {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 " + mainThread.getName());
		
		//이름을 정해주지 않으면 0부터 시작됨 - Thread-0
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.run();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.run();
	}

}
