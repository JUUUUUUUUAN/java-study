package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// 철수의 앵무새
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String str = sc.nextLine();
		
//		String result = (str.charAt(0)=='간' && str.charAt(1)=='다') ? "온다" : "간다";
//		System.out.println("앵무새 : " + result);
		
		// 삼항(조건) 연산자 이용
		// 변수 쪽에 equals()를 호출하면, str이 null일 경우 예외(NPE)가 발생할 수 있음
		// 
//		String output = str.equals("간다") ? "온다" : "간다";
		// 리터럴이나 상수를 앞에 두면, str이 null이어도 안전하게 비교 가능(null-safe)
		String output = "간다".equals(str) ? "온다" : "간다";
		System.out.println("앵무새 : " + output);
		
	}

}
