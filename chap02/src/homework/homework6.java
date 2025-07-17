package homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
		
		char digitChar = sc.nextLine().charAt(0);
		
		// char 타입의 숫자형 문자를 정수로 변환하여 계싼
		// int 이하의 타입들의 연산 시 자동으로 형변환됨 -> int 타입의 변수에 저장이 가능함
		int digit = digitChar - '0';
		int square = digit * digit;
		System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
		
		
	}

}
