package sec01.exam04;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10; // public static final이 자동으로 추가됨, 반드시 초기값 설정(인터페이스에서 필드는 모두 상수처리 되며 상수는 항상 초기값이 있어야 한다.)
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// 추상 메소드라서 실행 블록은 없는 상태
	// public abstract가 자동으로 추가됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}

