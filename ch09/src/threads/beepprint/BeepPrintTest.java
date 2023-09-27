package threads.beepprint;

import java.awt.Toolkit; //접근 불가 에러 뜰 시, module 파일 삭제

public class BeepPrintTest {

	public static void main(String[] args) {
		//싱글 스레드 - 메인 스레드만 실행
		
		//"띵" 문자를 5번 출력
		//Thread.sleep(1000) : 1초 간격 - 대기 시간
		//소리 발생 - Toolkit의 beep()
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); //milli sec //1000 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		//"띵" 소리를 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
