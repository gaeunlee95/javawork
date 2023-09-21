package interfaceex.remocon2;

import interfaceex.remocon.RemoteControl;

public class SmartTV implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
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
