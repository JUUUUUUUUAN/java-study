package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// 로또 번호 자동 생성기
		Scanner sc = new Scanner(System.in);
		int[] lottoNum = new int[6];
		
		for (int i = 0; i < lottoNum.length; i++) {
			// 1 ~ 45까지의 랜덤 숫자 6개 추가하기
			lottoNum[i] = (int) (Math.random() * 44) + 1;	
			
			// 중복값 찾기
//			for(int j = ; j <= i; i++) {
//				
//			}
		}
		
		// 정렬
		Arrays.sort(lottoNum);
		for (int i = 0; i <lottoNum.length; i++) {
			System.out.print(lottoNum[i] + ", ");
		}
	}	
}


