package threads.threadname;

//Thread 클래스를 상속
public class ThreadA extends Thread {
	//생성자 선언
	public ThreadA() {
		this.setName("ThreadA");
	}
	
	@Override
	public void run() {
		//ThreadA의 이름 - getName()
		for(int i=0; i<2; i++) {
			System.out.println(this.getName() + "가 출력한 내용");
		}
	
	
	
	}
	
}
