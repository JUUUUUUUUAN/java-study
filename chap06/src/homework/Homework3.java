package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// 올라갔다 내려갔다 
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.print("정수 :");
			int num = sc.nextInt();
			
			int count = 0;
			if (num < 3 || (num % 2 != 1)) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				for (int i = 0; i < num / 2 + 1; i++ ) {
					System.out.print((i + 1) + " ");
					count++;
				}
				for (int i = 0; i < num / 2; i++) {
					System.out.print((count - (i + 1)) + " ");
				}
				flag = false;
			}
			
		}
		
	}

}
