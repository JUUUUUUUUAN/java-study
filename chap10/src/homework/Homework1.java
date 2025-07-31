package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int) (Math.random() * 49) + 1;
		while (true) {
			int mynum = 0;
			System.out.print("1~50사이의 숫자 :");

			try {
				mynum = sc.nextInt();
			} catch (Exception e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine();
			}

			if (mynum > 50) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				continue;
			}
			
			if (num == mynum) {
				System.out.println("축하합니다~ 정답이에요");
				break;
			}else if (num > mynum) {
				System.out.println("Up!");
				continue;
			}else if (num < mynum) {
				System.out.println("Down!");
				continue;
			}
			
		}
	}

}
