package Homework;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.print("문자열 :");
			String str = sc.nextLine();
			System.out.print("문자 :");
			String first = sc.nextLine();
			
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == first.charAt(0)) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count );
			
			while (flag) {
				System.out.print("다시 입력하시겠습니까?");
				String again = sc.nextLine();
				
				if ("n".equals(again) || "N".equals(again)) {
					flag = false;
					System.out.println("프로그램 종료");
				} else if ("y".equals(again) || "Y".equals(again)) {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
			}
			
			
		}
	}

}
