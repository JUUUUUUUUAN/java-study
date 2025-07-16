package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		
		// 문제1 보건교사 김철수
			
		Scanner sc = new Scanner(System.in);
		Double height, weight, BMI;
		
		weight = sc.nextDouble();
		System.out.printf("몸무게(kg) : %1.1f\n", weight);
		height = sc.nextDouble();
		System.out.printf("키(m) : %1.2f\n", height);
		
		BMI = weight / (height * height) ;
		
		System.out.printf("BMI 지수 : %3.1f", BMI);
		
	}

}
