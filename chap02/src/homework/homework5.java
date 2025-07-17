package homework;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		
		// 총점과 평균 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		int sum;
		int ave;
	
		
		System.out.print("국어 : ");
		a = sc.nextDouble();
		System.out.print("영어 : ");
		b = sc.nextDouble();
		System.out.print("수학 : ");
		c = sc.nextDouble();
		
		sum = (int) (a + b + c);
		ave = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("수학 : " + ave);
		
		
	}

}
