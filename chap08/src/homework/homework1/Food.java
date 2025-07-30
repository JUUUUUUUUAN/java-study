package homework.homework1;

public class Food extends Product{
	private int expirationDays;
	
	public Food() {}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if (expirationDays <= 1) {
			return 80;
		}else if(expirationDays <= 5) {
			return 50;
		}else if(expirationDays <= 10) {
			return 20;
		}
		return 100;
	}
	
	@Override
		public int calculatePrice() {
			int disCount = this.calculateDiscountRate();
			return super.getPrice() / 100 * disCount;
		}
	
}
