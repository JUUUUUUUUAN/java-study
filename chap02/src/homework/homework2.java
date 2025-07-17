package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		//문제2 인테리어 김철수
		
		Scanner sc = new Scanner(System.in);
		
		double x,y; // 가로, 세로
		double a,b; // 면적, 둘레
		
		
		System.out.print("가로 : ");
		x = sc.nextDouble();
//		System.out.printf("가로 : %6.1f\n", x);
		System.out.print("세로 : ");
		y = sc.nextDouble();
//		System.out.printf("세로 : %6.1f\n", x);
		
		a = x * y; // 면적
		b = (x + y) * 2; //둘레
		
		System.out.printf("면적 : %.2f\n", a);
		System.out.printf("둘레 : %.1f\n", b);
		
	}

}
