package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========일기예보=========");
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("기온: ");
		int tem = sc.nextInt();
		
		String season = "";
		
		// Early Return Pattern
		// 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
		// 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
		if (month <1 || month >12) {
			System.out.println("해당하는 계절이 없습니다.");
			return;
		}
		
		if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
			
			if (tem >= 35) {
				season += " 폭염 경보";
			} else if (tem >= 33) {
				season += " 폭염 주의보";
			}
		} else if (month >= 8 && month <= 12) {
			season = "가을";
		} else {
			season = "겨울";
			
			if (tem <= -15) {
				season += " 한파 경보";
			} else if (tem <= -12) {
				season += " 한파 주의보";
			}
		}
		
		System.out.println(season);
		
		
		// 내가 작성
//		if (month >= 3 && month < 6) {
//			System.out.print("봄");
//		} else if (month >= 6 && month < 8) {
//			System.out.print("여름");
//			if (tem >= 35) {
//				System.out.print(" 폭염 경보");				
//			} else if (tem >= 33) {
//				System.out.print(" 폭염 주의보");
//			}
//		} else if (month >= 8 && month < 12) {
//			System.out.print("가을");
//		} else if ( (month >= 1 && month < 3) || month == 12) {
//			System.out.print("겨울");
//			if (tem <= -15) {
//				System.out.print(" 한파 경보");				
//			} else if (tem <= -12) {
//				System.out.print(" 한파 주의보");
//			}
//		} else {
//			System.out.print("계절이 없습니다.");
//		}
		
		
	}

}
