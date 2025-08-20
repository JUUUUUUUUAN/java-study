package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========세 개의 정수 비교하기=========");
		
		System.out.print("첫 번쨰 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수: ");
		int num2 = sc.nextInt();
		System.out.print("세 번쨰 정수: ");
		int num3 = sc.nextInt();
		
//		int min = 0;
		
//		처음 짠 코드
//		if (num1 < num2 && num1 < num3) {
//			System.out.println( num1 + "입니다.");
//		} else if (num2 < num1 && num2 < num3) {
//			System.out.println( num2 + "입니다.");
//		} else {
//			System.out.println( num3 + "입니다.");
//		}
		
		
//		두번째로 짠 코드
//		if (num1 < num2) min = num1;
//		else min = num2;		
//		if (num3 < min) min = num3;

//		세번째로 짠 코드
		int min = num1 < num2 ? num1 : num2 ;
		if (num3 < min) min = num3;
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min);
		
	}

}
