package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======놀이동산 입장료 계산하기========");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("당신의 놀이동산 요금은 ");
		if (age < 3) {
			System.out.println("무료입니다.");
			
		} else if (age <= 12) {
			System.out.println("10000입니다.");
			
		} else if (age <= 18) {
			System.out.println("20000입니다.");
			
		} else if (age <= 64) {
			System.out.println("30000입니다.");
		} else {			
			System.out.println("무료입니다.");
		}
		
		
	}

}
