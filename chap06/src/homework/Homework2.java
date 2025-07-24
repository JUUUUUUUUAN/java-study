package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// 값 입력 받아 배열 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 :");
//		int arrayNum = sc.nextInt();
		int[] intArray = new int[sc.nextInt()];	

		for (int i = 0; i < intArray.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 :");
			intArray[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
		System.out.println();
		System.out.println("총합 " + sum);
		
	}

}
