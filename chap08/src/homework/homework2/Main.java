package homework.homework2;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Menu[] menuArr = new Menu[5];
		
		// 인덱스가 0인 경우 디시객체 스테이크, 30000, 소고기, 소금, 후추
		// 인덱스가 0이 아닌 경우 드링크객체 아메리카노, 5000, 에스프레소1샷, 물
		
		
		for (int i = 0; i < menuArr.length; i++) {
			int Num = (int) (Math.random() * 2);
			if (Num == 0) {
				menuArr[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			} else {
				menuArr[i] = new Drink("아메리카노", 5000, "에스프레소1샷, 물");
			}
			
			if (menuArr[i] instanceof Dish dish) {
				dish.cook();
			} else {
				Drink drink = (Drink) menuArr[i];
				drink.cook();				
			}
				
		}
	}
}
