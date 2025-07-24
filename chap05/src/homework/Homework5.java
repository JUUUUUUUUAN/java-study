package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int input = sc.nextInt();
			
			if (input == 0) 
				break;
			
			if (input < 0)
				continue;

				sum += input;
		}
			System.out.println("양수의 합계: " + sum);
	}
		
}


