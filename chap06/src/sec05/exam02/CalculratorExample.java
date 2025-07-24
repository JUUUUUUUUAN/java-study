package sec05.exam02;

public class CalculratorExample {

	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기
		
		// 잘못된 접근 방식
//		Calculrator calc = new Calculrator();
//		double result1 = 10 * 10 * calc.pi;
		
		// static 접근 방식
		double result1 = 10 * 10 * Calculrator.pi;
//		double result1 = 10 * 10 * Math.PI; // 참고용
		System.out.println("result1: " + result1);
		
		int result2 = Calculrator.plus(10, 5);
		int result3 = Calculrator.minus(15, 5);
		// 참고: 주로 유틸리티성 기능에 쓰임
		
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
	}

}
