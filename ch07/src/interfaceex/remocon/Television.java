package interfaceex.remocon;

//RemoteControl 인터페이스를 구현한 Television 클래스
public class Television implements RemoteControl{
	
	//필드
	//접근제어자 private 인 정수형 변수 volume 생성 
	private int volume;
	
	//turnOn() 구현부 삽입
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff() 구현부 삽입
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 구현부 삽입
	//최대, 최소볼륨 
	@Override
	public void setVolume(int volume) {
		//volume: 0 ~ 10 설정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = 10;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = 0;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
}
