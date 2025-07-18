package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지의 합!
		int sum = 0; // 초기화 해주지 않으면 메모리에 생성이 되지 않기때문에 초기화 해주어야 한다.
		
		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		}
		
		System.out.println("1~100 합: " + sum);
//		System.out.println("1~" + i + " 합: " + sum); // i는 for문 내부에서만 사용 가능한 지역 변수
		
	}

}
