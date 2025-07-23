package Homework2;

public class ExMethodController {

	void print(String message) {
		System.out.println(message);
	}
	
	int sum1To100(){
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	String sniffling(int num) {
		if(num % 2 == 1) {
			return "홀수";
		}
		return "짝수";
	}
	
	void english (String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("영문자가 포함되어 있습니다.");
		} else {
			System.out.println("영문자가 포함되어 있지 않습니다.");
		}
	}
		
	
	int getChar(String str, char w) {
		int count = 0; 
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == w) {
				count++;
			}
		}
		return count;
	}
	
	void multipl(int num) {
		for (int i = num; i <= num; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
	
	
}
