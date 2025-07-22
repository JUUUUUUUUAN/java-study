package homework;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호(-): ");
		
		char str = sc.nextLine().charAt(7);
		int num = str - '0'; // 이 부분 중요 차이값으로 숫자를 찾아내야 한다
		String uni = (num == 1 || num == 3) ? "남자" : (num == 2 || num == 4)? "여자" : "잘못된 값";
		System.out.println("입력하신 주민번호는 " + uni + "입니다.");
//		System.out.println(num);
		
	}

}
