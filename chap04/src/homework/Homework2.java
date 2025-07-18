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
		
		if (month >= 3 && month < 6) {
			System.out.print("봄");
		} else if (month >= 6 && month < 8) {
			System.out.print("여름");
			if (tem >= 35) {
				System.out.print(" 폭염 경보");				
			} else if (tem >= 33) {
				System.out.print(" 폭염 주의보");
			}
		} else if (month >= 8 && month < 12) {
			System.out.print("가을");
		} else if ( (month >= 1 && month < 3) || month == 12) {
			System.out.print("겨울");
			if (tem <= -15) {
				System.out.print(" 한파 경보");				
			} else if (tem <= -12) {
				System.out.print(" 한파 주의보");
			}
		} else {
			System.out.print("계절이 없습니다.");
		}
		
		
	}

}
