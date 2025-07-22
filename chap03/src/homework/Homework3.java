package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// 철수의 화이트데이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구의 수: ");
		int friend = sc.nextInt();
		
		System.out.print("사탕의 수: ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕의 개수: " + candy / friend);
		System.out.println("남은 사탕의 개수: " + candy % friend);
		
		
	}

}
