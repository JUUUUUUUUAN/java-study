package homework;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 :");
			int num = sc.nextInt();
			String output = "";
			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 1) {
//					output += "박";
//				} else {
//					output += "수";
//				}
//			}
			
			for (int i = 1; i <= num; i++) {
				output += ( i % 2 == 1) ? "박" : "수";
//				System.out.print(i % 2 == 1 ? "박" : "수");
			}
			System.out.println(output);
			break;
		}
	}

}
