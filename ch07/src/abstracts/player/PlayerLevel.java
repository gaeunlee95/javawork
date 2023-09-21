package abstracts.player;

public abstract class PlayerLevel {
	//추상메서드
	//run(), jump(), turn(), showLevelMessage() 선언
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드
	//go() 메서드를 실행 시 runt(), jump(), turn() 실행 /jump(a)는 a 만큼 실행됨 
	public final void go(int count) {
		run();
		for(int i=0; i<count; i++) {	//jump()는 횟수 있음
			jump();
		}
		turn();
	}
	
}
