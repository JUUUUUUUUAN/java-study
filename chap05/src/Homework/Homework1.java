package Homework;

import java.util.Iterator;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;	
		int sum = 0;
		
		while (flag) {
			
			System.out.print("정수(1~50) :");
			int num = sc.nextInt();
			
			if (num > 51 || num < 0) {
				System.out.print("1~50 사이의 정수를 입력하세요. \n");	
				continue;
			} else {	
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0 ) {
						sum += i;
//						System.out.println(sum);
					}
				}				
			}
			flag = false;
		}
		
		System.out.println("합계: " + sum);
		
		
	}

}
