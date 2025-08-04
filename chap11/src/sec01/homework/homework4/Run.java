package sec01.homework.homework4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(true) {
			System.out.print("문자열: ");
			String a = sc.nextLine();
			if ("n".equalsIgnoreCase(a)) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("최종 문자열: " + str);
				break;
			} else{
				str += a;
			}
			
		}
	}

}
