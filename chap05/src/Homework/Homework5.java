package Homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;
		
		while (flag) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int input = sc.nextInt();
			
			if (input == 0 ) {
				System.out.println("양수의 합계: " + sum);
				flag = false;
				break;
			}
			
			if (input < 0 ) {
				continue;
			} else {
				sum += input;
			}
			
		}
	}

}
