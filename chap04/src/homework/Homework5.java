package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======헬스 마니아 철수========");
		
	
		System.out.println("1. 스쿼트");
        System.out.println("2. 데드리프트");
        System.out.println("3. 벤치 프레스");
        System.out.println("4. 풀업");
        System.out.println("5. 종료");
		
        System.out.println("입력: ");
        int num = sc.nextInt();
        
//      처음 짠 코드
//		if (num <= 5 && num > 0 ) {
//				if (num == 1) {
//					System.out.println("스쿼트 운동 시간입니다.");		
//				} else if (num == 2) {
//					System.out.println("데드리프트 운동 시간입니다.");
//				} else if (num == 3) {
//					System.out.println("벤치 프레스 운동 시간입니다.");
//				} else if (num == 4) {
//					System.out.println("풀업 운동 시간입니다.");
//				} else if (num == 5) {
//					System.out.println("오늘도 수고하셨습니다. ");
//				}
//		} else if (num > 5) {
//			System.out.println("목록에 있는 숫자만 입력해주세요.");		
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
        
//      양수가 아닌 경우는 Early Return 처리하기
        if (num < 0) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
//      5가 아닌 경우는 else문에서 모두 처리되니 코드를 이중으로 짤 필요가 없다.
        if(num == 1) System.out.println("스쿼트 운동 시간입니다.");
        else if (num == 2 ) System.out.println("데드리프트 운동 시간입니다.");
        else if (num == 3 ) System.out.println("벤치 프레스 운동 시간입니다."); 
        else if (num == 4) System.out.println("풀업 운동 시간입니다.");
        else if (num == 5) System.out.println("오늘도 수고하셨습니다. ");
        else System.out.println("목록에 있는 숫자만 입력해주세요.");
		
        
        
        
        
	}

}
