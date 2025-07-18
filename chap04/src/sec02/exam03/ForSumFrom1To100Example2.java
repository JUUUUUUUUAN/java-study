package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합!
		int sum = 0; // 초기화 해주지 않으면 메모리에 생성이 되지 않기때문에 초기화 해주어야 한다.
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		}
		
		System.out.println("1~" + (i - 1) + " 합: " + sum); // i는 for문 내부에서만 사용 가능한 지역 변수
		
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한 반복");
			count++;
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			
			if (count == 6) {
				break;
			}
		}
		
		//Quiz1: 1부터 100까지 짝수의 합
		
		sum = 0;
		
		for (i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		
		int txt = sc.nextInt();
		sum = 0;
		
		if (txt % 2 == 0) {
			for (i = 0; i <= txt; i += 2) {
				sum += i;
			}
		} else {
			for (i = 1; i <= txt; i += 2) {
				sum += i;
			}
		}
		System.out.println("결과: " + sum);
		
	}

}
