package sec01.homework.homework2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] address = new String[4];

		for (int i = 0; i < address.length; i++) {
			address[i] = sc.nextLine();
		}
		
		for (int j = 0; j < address.length; j++) {
			Practice p1 = new Practice();
			System.out.println(p1.takeState(address[j]));	
		}
		
	}

}
