package Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ans = "";
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			ans = sc.next();
			if ("no".equals(ans)) {
				break;
			}
		} while ("yes".equals(ans));
		
		System.out.println("게임을 종료합니다.");
	}

}
