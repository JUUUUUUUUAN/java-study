package Homework;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.print("정수 :");
			int num = sc.nextInt();
			String output = "";
			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					output += "박";
				} else {
					output += "수";
				}
			}
			System.out.println(output);
			flag = false;
		}
	}

}
