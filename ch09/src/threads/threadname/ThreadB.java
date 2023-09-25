package threads.threadname;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		//TheadA의 이름 - getName()
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	
	
	
	}
	
}
