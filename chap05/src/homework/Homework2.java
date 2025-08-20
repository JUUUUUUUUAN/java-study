package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		처음 짠 코드 수정 사항 : Early Return문 추가하기
//		while (true) {
//			
//			System.out.print("숫자 : ");
//			int num = sc.nextInt();
//			
//			if (num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} else if (num < 0) {
//				System.out.println("양수만 입력해주세요.");
//				continue;
//			} else if (num > 9) {
//				System.out.println("9이하의 숫자를 입력해주세요.");
//				continue;
//			} else {
//				for (int i = num; i <= 9; i++) {
//					System.out.println("=== " + i +"단 ===");
//					for (int j = 1; j <= 9; j++) {
//						System.out.println(i + " x " + j + " = " + (i * j));
//					}
//				}
//			}
//		}
		
		while(true) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (num == 0 ) { System.out.println("프로그램을 종료합니다."); break; }
			else if (num < 0 ) { System.out.println("양수만 입력해주세요"); continue; }
			else if (num > 9 ) { System.out.println("9이하의 숫자를 입력해주세요"); continue; }
			
			for(int i = num; i <= 9; i++) {
				System.out.println("=== " + i +"단 ===");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
			break;
		}
		
		
		
		
		
	}

}
