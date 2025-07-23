package Homework2;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Homework1 first = new Homework1();
		
		System.out.print("첫번째 문자: ");
		String fir = sc.nextLine();
		System.out.print("두번째 문자: ");
		String sec = sc.nextLine();
		
		System.out.println("문자의 곱: " +first.stringSum(fir, sec));
		
		System.out.println();
		System.out.println();
		
		System.out.print("첫번째 숫자: ");
		int fir1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int sec1 = sc.nextInt();
		
		System.out.println("두수의 곱: " + first.intPer(fir1, sec1));
		
		System.out.println();
		System.out.println();
		
		System.out.print("비교할 첫 번재 글자: ");
		String s1 = sc.next();
		System.out.print("비교할 두 번재 글자: ");
		String s2 = sc.next();
		
		System.out.println(first.stringCompare(s1, s1));
		
		
		ExMethodController ex1 = new ExMethodController();
		
		String message = sc.nextLine();
		
		
		ex1.print(message);
		System.out.println();
		
		System.out.println("1~100까지의 합: " + ex1.sum1To100());
		System.out.println();
		
		System.out.print("숫자를 입력하세요(홀/짝): ");
		int num = sc.nextInt();
		System.out.println(num + "은 " + ex1.sniffling(num) + "입니다.");
		
		System.out.println();
		System.out.print("입력하세요: ");
		String str = sc.nextLine();
		ex1.english(str);
		
		System.out.println();
		
		System.out.print("입력하세요: ");
		String str1 = sc.nextLine();
		System.out.print("찾을 단어를 입력하세요: ");
		char word = sc.nextLine().charAt(0);
		
		System.out.println("'" + word + "'" + "는 " + ex1.getChar(str1, word) + " 개 있습니다.");
		System.out.println();
		
		System.out.println("숫자를 입력하세요(구구단): ");
		ex1.multipl(sc.nextInt());
				
	}

}
