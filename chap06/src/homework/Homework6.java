package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 :");
		int strNum = sc.nextInt();
		sc.nextLine();
		int count = 0;
		int lastCount = 0;
		
		// 처음 배열 생성
		String[] arr = new String[strNum];
		for (int i = 0; i < arr.length; i++) {
			count++;
			System.out.print(count + "번째 문자열:");
			arr[i] = sc.nextLine();
		}
		
		// 배열 추가 여부
		while (true) {	
			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			String again = sc.nextLine();
			
			// 배열 추가
			int plusNum = 0; // 추가할 행
			if ("y".equalsIgnoreCase(again)) {
				System.out.print("더 입력하고 싶은 개수 :");
				
				// 추가할 행
				plusNum = sc.nextInt();
				sc.nextLine();
				// 행 추가하여 복사하기
				arr = Arrays.copyOf(arr, count + plusNum);
				
				// 추가된 행에 값 넣기
				lastCount = count + plusNum;
				for (int i = count; i < lastCount; i++) {
					count++;
					System.out.print(count + "번째 문자열: ");
					arr[i] = sc.nextLine();
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
