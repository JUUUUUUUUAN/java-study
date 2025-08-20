package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
//		boolean flag = true;	
//		while (flag) {
//			System.out.print("정수(1~50) :");
//			int num = sc.nextInt();
//			
//			if (num > 50 || num < 1) {
//				System.out.print("1~50 사이의 정수를 입력하세요. \n");	
//				continue;
//			} else {	
//				for (int i = 1; i <= num; i++) {
//					if (i % 2 == 0 ) {
//						sum += i;
//					}
//				}				
//			}
//			flag = false;
//		}
		
		while (true) {
			System.out.println("정수(1~50): ");
			num = sc.nextInt();
			
			if (num < 1 || num > 50) {
				System.out.println("1~50 사이의 정수를 입력하세요");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
			}
			break;
		}
		
		System.out.println("합계: " + sum);
		
		
	}

}
