package threads.synchronize;

public class Calculator {
	//필드
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	
	//synchronized 키워드를 붙이면 lock 걸어서
	//다른 스레드에 의해서 변경되지 않음
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초간 대기 //다른 스레드가 접근할 시간텀을 줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	
	//현재 스레드 이름
	System.out.println(Thread.currentThread().getName() 
			+ ":" + this.memory);
	
	}
	
}
