package Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			String ans = sc.next();
			if ("no".equals(ans)) {
				flag = false;
			}
		} while (flag);
		
		System.out.println("게임을 종료합니다.");
	}

}
