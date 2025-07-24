package homework;

public class Homework8 {

	public static void main(String[] args) {
		
		// 어제의 메뉴판
		String[] menu = {"Burger", "Pizza", "Pasta"};
		
		// 새로운 메뉴판
		String[] add = {"Salad","Soup"};
		
		// 어제 + 새로운 메뉴판
		String[] newMenu = new String[menu.length + add.length];
		System.arraycopy(menu, 0, newMenu, 0, menu.length);
		System.arraycopy(add, 0, newMenu, menu.length, add.length);
		
		System.out.print("어제 메뉴판: ");
		for (int i = 0; i < menu.length; i++) {
			System.out.print(menu[i] + ", ");
		}
		
		System.out.println();
		
		System.out.print("새로운 메뉴판: ");
		for (int i = 0; i < newMenu.length; i++) {
			System.out.print(newMenu[i] + ", ");
		}
	}

}
