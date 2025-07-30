package homework.homework1;

public class Product {
	private String name;
	private int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		double Discountprice = price * 0.9 ;
		this.price = (int) Discountprice; 
		return (int) Discountprice ;
	}
	
	
}
