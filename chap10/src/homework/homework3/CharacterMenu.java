package homework.homework3;

import java.util.Scanner;

public class CharacterMenu {
	public void menu() {	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	CharacterController cc = new CharacterController();
	try {
		int count = cc.countAlpha(str);		
		System.out.println();
	} catch (CharCheckException e) {
		e.printStackTrace();
	}
	
	}
}
