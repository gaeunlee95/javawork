package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		// 스레드를 익명 객체 구현 - 소리 재생
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(1000); //1초 동안 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		};
		thread.start(); //스레드 실행
		
		//문자 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
