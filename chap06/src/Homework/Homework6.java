package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 :");
		int strNum = sc.nextInt();
		
		// 배열 생성
		String[] str = new String[strNum];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
			
		while (true) {	
			System.out.println("더 값을 입력하시겠습니까?(Y/N) :");
			String again = sc.next();
			
			// 배열 추가하기
			int plusNum = 0;
			if ("y".equalsIgnoreCase(again)) {
				System.out.println("더 입력하고 싶은 개수 :");
				plusNum = sc.nextInt();
				
				String[] arr = new String[strNum+plusNum];
				arr = Arrays.copyOf(str,strNum);
				
				for(int i = strNum; i < strNum + plusNum; i++ ) {
					arr[i] = sc.nextLine();
				}
			
			} 		
			
		}	
		
	}

}
