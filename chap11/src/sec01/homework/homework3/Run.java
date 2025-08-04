package sec01.homework.homework3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		email = email.trim();
		
		int index = email.indexOf("@");
		if ("@goodee.co.kr".equals(email.substring(index)) ) {
			String Id = (String) email.subSequence(0, index);
			System.out.println("아이디: " + Id.toUpperCase());
		}else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
	}

}
