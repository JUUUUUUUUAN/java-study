package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		//컴퓨터와 가위바위보
		Scanner sc = new Scanner(System.in);
		String[] choices = {"가위", "바위", "보"};
		
		int comNum = (int) (Math.random() * 2);
		int totalCount = 0;
		int loseCount = 0;
		int wincount = 0;
		int drawcount = 0;
		
		
		while (true) {
			System.out.print("가위바위보 :");
			String user = sc.nextLine();
			
			int userNum = 0;
			if("stop".equals(user)) {
				System.out.println(totalCount +"전 " + wincount + "승 " + drawcount + "무 " + loseCount + "패");
				break;
			} else if ("가위".equals(user)) {
				userNum = 0;
			} else if ("바위".equals(user)) {
				userNum = 1;
			} else if ("보".equals(user)) {
				userNum = 2;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.println("컴퓨터 :" + choices[comNum]);
			System.out.println("사용자 :" + choices[userNum]);
			
			if (comNum == userNum) {
				System.out.println("비겼습니다.");
				drawcount++;
			} else if (comNum + userNum == 1) {
				if (comNum > userNum) {
					System.out.println("졌습니다ㅜㅜ");
					loseCount++;
				}else {
					System.out.println("이겼습니다!");
					wincount++;
				}
			} else if (comNum + userNum == 2) {
				if (comNum > userNum) {
					System.out.println("이겼습니다!");
					wincount++;
				}else {
					System.out.println("졌습니다ㅜㅜ");
					loseCount++;
				}
			} else {
				if (comNum > userNum) {
					System.out.println("졌습니다ㅜㅜ");
					loseCount++;
				}else {
					System.out.println("이겼습니다!");
					wincount++;
				}
			}
			
			totalCount++;	
		}
	}

}
