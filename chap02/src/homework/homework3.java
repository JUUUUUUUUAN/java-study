package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {

		// 첫번째, 두번째, 세번째 문자
		
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.print("문자열을 입력하세요: ");
		word = sc.next();
		System.out.println("첫번째 문자 : " + word.charAt(0));
		System.out.println("두번째 문자 : " + word.charAt(1));
		System.out.println("세번째 문자 : " + word.charAt(2));
		
	}

}
