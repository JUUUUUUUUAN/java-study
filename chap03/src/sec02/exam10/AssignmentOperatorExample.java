package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10; // result = result + 10; 
		System.out.println("result=" + result);
		
		result -= 5; // result = result - 5; 
		System.out.println("result=" + result);
		
		result *= 3; // result = result * 3; 
		System.out.println("result=" + result);
		
		result /= 5; // result = result / 5; 
		System.out.println("result=" + result);
		
		result %= 3; // result = result % 3; 
		System.out.println("result=" + result);

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		
		int total = sc.nextInt();
		
		int num1 = total / 500;
		total -= (num1 * 500);
		System.out.print("500원: " + num1 + "개\n");
//		System.out.println(total);
		
		int num2 = total / 100;
		total -= (num2 * 100);
		System.out.print("100원: " + num2 + "개\n");
		
		int num3 = total / 50;
		total -= (num3 * 50);
		System.out.print("50원: " + num3 + "개\n");
		
		int num4 = total / 10;
		total -= (num4 * 10);
		System.out.print("10원: " + num4 + "개\n");
		
		int num5 = total;
		System.out.print("1원: " + num5 + "개\n");
		
//		int num5 = total / 1;
//		total -= (num5 * 1);
//		System.out.print("50원: " + num5 + "개\n");
		
		
		
	}

}
