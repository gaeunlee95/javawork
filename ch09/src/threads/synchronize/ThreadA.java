package threads.synchronize;

public class ThreadA extends Thread {
	//공유 객체 필드 선언
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
	
}
