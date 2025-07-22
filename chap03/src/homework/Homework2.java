package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//구슬이 짝수? 홀수?
		
		System.out.print("구슬의 개수: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result = (num % 2 == 1) ? "홀수" : "짝수" ;
		
		System.out.println("구슬의 개수는 " + result + "입니다.");
	}

}
