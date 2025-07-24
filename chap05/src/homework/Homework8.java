package homework;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (true) {
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
			
			while (true) {
				System.out.print("다시 입력하시겠습니까?");
				String again = sc.nextLine();
				
				if ("n".equalsIgnoreCase(again)) { // 같은 의미 "n".equals(again) || "N".equals(again)
					System.out.println("프로그램 종료");
					return; // main 메소드 종료
				} else if ("y".equalsIgnoreCase(again)) {
					break; // 바깥 while 문으로 다시 돌아감
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
			}
			
			
		}
	}

}
