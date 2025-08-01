package sec05.exam04;

public class Singleton {
	// Step2
	private static final Singleton singleton = new Singleton();
	// private으로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용(공유)하기 위해
	
	
	
	// Step 1
//	Singleton(){ } // 외부에서 호출이 가능 -> 여러 개의 객체 생성 가능
	private Singleton() {} //private: 비공개, 외부에서 new 연산자로 오출 불가
	
	
	//Step 3
	public static Singleton getInstance() { // 싱글톤 객체를 반환하는 메소드 이름은 관례적
		// 자기 자신의 객체를 리턴
		return singleton;
		
	}
	
}
