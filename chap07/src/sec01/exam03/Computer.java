package sec01.exam03;

public class Computer extends Calculator {
	// Source - Override 메뉴 사용
//	@Override
//	double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
	// 자바에서 제공하는 정확한 PI값을 사용해 정밀한 계산을 하도록 변경
	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()을 실행");
		return Math.PI * r * r;
	}
	
	// 선언부가 다르면 그냥 다른 메소드인 것임
	
	
	
}
