package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// 키 순서대로 앉으세요
		Scanner sc = new Scanner(System.in);
		
		int[] tall = {152, 180, 165, 158, 171};
//		for (int i = 0; i < tall.length; i++) {
//			tall[i] = sc.nextInt();
//		}
		
		for	(int i = 0; i < tall.length - 1; i++) { // 최대 n-1회전이 필요
			// 1을 빼주는 이유? 1회전 돌때마다 마지막 정렬된 요소는 비교하지 않아도 됨
			for (int j = 0; j < tall.length - 1; j++) {
				if (tall[j] > tall[j+1]) {
					// 두 값을 교환
					int tem = tall[j+1];
					tall[j+1] = tall[j];
					tall[j] = tem;
				}
			}
		}
		
		for (int i = 0; i < tall.length; i++) {
			System.out.print(tall[i] + " ");			
		}
		
	}

}
