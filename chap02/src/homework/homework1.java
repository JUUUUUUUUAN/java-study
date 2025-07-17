package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		
		// 문제1 보건교사 김철수
			
		Scanner sc = new Scanner(System.in);
		Double height, weight, BMI;
		
		System.out.print("몸무게(kg) : ");
		weight = sc.nextDouble();
//		System.out.printf("%1.1f\n", weight); // 굳이 한 번 더 출력할 필요 없음, 입력값과 출력값으로 값이 두 개가 보임
		
		
		System.out.print("키(m) :");
		height = sc.nextDouble();
//		System.out.printf(" %1.2f\n", height); // 굳이 한 번 더 출력할 필요 없음, 입력값과 출력값으로 값이 두 개가 보임
		
		BMI = weight / (height * height) ;
		
		System.out.printf("BMI 지수 : %.1f\n", BMI);
		System.out.println("BMI 지수 : " + (int) (BMI * 10) / 10.0); // (int) (BMI * 10) 먼저 계산되고 나누기 진행함
		System.out.println("BMI 지수 : " + Math.floor(BMI * 10) / 10); // 소수점 내리기
		
		
	}

}
