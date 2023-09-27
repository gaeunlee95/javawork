package threads.synchronize;

public class ThreadB extends Thread {
	//공유 객체 필드 선언
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
		setName("ThreadB");
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
	
}
