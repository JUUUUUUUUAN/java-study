package Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// 키 순서대로 앉으세요
		Scanner sc = new Scanner(System.in);
		
		int[] tall = new int [5];
		for (int i = 0; i < tall.length; i++) {
			tall[i] = sc.nextInt();
		}
		
		int tem = 0;
		for	(int i = 0; i < tall.length - 1; i++) {
			for (int j = 0; j < tall.length - 1; j++) {
				if (tall[j] > tall[j+1]) {
					tem = tall[j+1];
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
