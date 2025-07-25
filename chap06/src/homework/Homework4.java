package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// 로또 번호 자동 생성기
		int[] lottoNum = new int[6];
		
//		for (int i = 0; i < lottoNum.length; i++) {
//			// 1 ~ 45까지의 랜덤 숫자 6개 추가하기
//			lottoNum[i] = (int) (Math.random() * 45) + 1;	
//			
//			// 중복값 찾기
//			int num = lottoNum[i];
//			for(int j = 0; j <= lottoNum.length; i++) {
//				if () {
//					
//				}
//			}
//		}
		
		// 정렬
		Arrays.sort(lottoNum);
		for (int i = 0; i <lottoNum.length; i++) {
			System.out.print(lottoNum[i] + ", ");
		}
	}	
}


