package threads.beepprint;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//beepTask 객체 생성
		BeepTask beepTask = new BeepTask();
		//작업 스레드 객체 생성(소리 발생)
		Thread thread = new Thread(beepTask);
		thread.start(); //스레드 시작(실행)
		
		//문자를 출력
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); //milli sec //1000 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
