package homework.homework8;

import java.util.Scanner;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.println("메뉴 번호: ");
			int sc1 = sc.nextInt();
			if(sc1 == 1) {
//				System.out.println("1");
				chocolateMenu();
			}else if (sc1 == 2) {
				greenTeaMenu();
			}else if(sc1 == 9) {
				System.out.println("종료");
				break;
			}else {
				continue;
			}
		}
	}
	
	public void chocolateMenu() {
		double flour;
		double cream;
		int cherry;
		int chip;
		System.out.print("밀가루(g) : ");
		flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) :");
		chip = sc.nextInt();
		cc.bakeChocolateCake(flour, cream, cherry, chip);
		
	}
	
	public void greenTeaMenu() {
		double flour;
		double cream;
		double powder;
		int cheese;
		System.out.print("밀가루(g) : ");
		flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		cream = sc.nextDouble();
		System.out.print("녹차 파우더(g) : ");
		powder = sc.nextDouble();
		System.out.print("초치즈 큐브(개) :");
		cheese = sc.nextInt();
		gtc.bakeGreenTeaCake(flour, cream, powder, cheese);
		
	}
}
