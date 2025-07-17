package homework;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		// 유니코드 출력하기
		
		Scanner sc = new Scanner(System.in);
		
//		String a;
//		char b = 'A';		
//		a = sc.nextLine();		
//		System.out.println((int) a.charAt(0)); // 입력 받은 값은 문자열로 입력되지만 chatAt()을 사용하면 char로 형변환
//		System.out.println((int)b);
		
		System.out.print("문자를 입력하세요: ");
		char inputChar = sc.nextLine().charAt(0);
		
		System.out.println((int) inputChar);
		
		
	}

}
