package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 :");
		int strNum = sc.nextInt();
		int count = 0;
		int lastCount = 0;
		
		// 배열 생성
		String[] arr = new String[strNum];
		for (int i = 0; i < arr.length; i++) {
			count++;
			System.out.print(count + "번째 문자열:");
			arr[i] = sc.next();
		}
		while (true) {	
			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			String again = sc.next();
			
			// 배열 추가하기
			int plusNum = 0; // 추가할 행
			if ("y".equalsIgnoreCase(again)) {
				System.out.print("더 입력하고 싶은 개수 :");
				plusNum = sc.nextInt();
				lastCount = count + plusNum;
				
				arr = Arrays.copyOf(arr, count + plusNum);
				for (int i = count; i < lastCount; i++) {
					count++;
					System.out.print(count + "번째 문자열: ");
					arr[i] = sc.next();
				}
				
			} else if ("n".equalsIgnoreCase(again)) {
//				System.out.println(Arrays.toString(arr));
				for (int i = 0; i < lastCount; i++) {
					System.out.println(arr[i]);
				}
				break;	
			} else {
				System.out.println("입력할 수 없는 값입니다.");
				continue;
			}
			
			
		}	
		
	}

}
