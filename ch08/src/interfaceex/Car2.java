package interfaceex;

public class Car2 {
	//필드 - 배열로 선언
	//Tire형 배열 tires에 기본 타이어(HanTire, HanTire, KumTire, KumTire) 셋팅
	Tire[] tires = {
		new HanTire(),
		new HanTire(),
		new KumTire(),
		new KumTire()
	};
	
	//메서드
	//향상된 for문을 사용하여, run()메서드 사용 시 각 타이어 roll()사용될 수 있도록 메서드 선언
	void run() {
		for(Tire tire : tires)
			tire.roll();
	}
	
}
