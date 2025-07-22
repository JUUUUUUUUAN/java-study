package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		// 합계
		int sum = korean + math + english;
		// 평균
		double ave = sum / 3.0;
		
		System.out.println("합계: " + sum + "점");
		System.out.println("평균: " + ave + "점");
		
		String result = ( ave <= 90) ?
						"휴대폰을 바꿀 수 없습니다." 
							: ((korean >= 60 && math >= 60 && english >= 60) 
							? "휴대폰 바꾸기 성공!" : "휴대폰을 바꿀 수 없습니다." );
		
		System.out.print(result);
		
		
	}

}
