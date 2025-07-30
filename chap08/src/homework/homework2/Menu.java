package homework.homework2;

public abstract class Menu {
	private String name;
	private int price;
	
	protected Menu() {
		super();
	}

	protected Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "메뉴명: " + name + "\n가격: " + price;
	}
	
	public abstract void cook();
}
