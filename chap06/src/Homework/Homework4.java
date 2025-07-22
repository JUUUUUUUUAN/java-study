package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// 로또 번호 자동 생성기
		Scanner sc = new Scanner(System.in);
		int[] lottoNum = new int[6];
		
		again: for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 44) + 1;
			
			//중복 값 찾기
//			for (int j = 0; j < lottoNum.length-1; j++) {
//				if (lottoNum[i] == lottoNum[i+1]) {
//					break again;
//				}
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


