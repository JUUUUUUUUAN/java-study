package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while문 조건식에 아래의 변수가 필요하니 전역변수로 선언하는 것이 맞다.
		String ans = "";
		
//		문제 yes일 경우만 게임 재실행 no(다른 오답)의 경우 게임 종료
//		do {
//			System.out.println("게임을 실행합니다!");
//			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
//			ans = sc.nextLine();
//			if ("no".equals(ans)) {
//				break;
//			}
//		} while ("yes".equals(ans));
//		
//		System.out.println("게임을 종료합니다.");
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			ans = sc.nextLine();
		}while ("yes".equals(ans));
			
		System.out.println("게임을 종료합니다.");
		
	}

}
