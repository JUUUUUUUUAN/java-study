package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// 철수의 앵무새
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String str = sc.nextLine();
		String result = (str.charAt(0)=='간' && str.charAt(1)=='다') ? "온다" : "간다";
		System.out.println("앵무새 : " + result);
		
		
	}

}
