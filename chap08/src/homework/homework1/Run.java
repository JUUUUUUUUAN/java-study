package homework.homework1;

public class Run {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1 = new Food("치킨", 20000, 3);
		p2 = new Book("자바의 정석", 15000);
		
		p1.calculatePrice();
		p2.calculatePrice();
		
		System.out.println(p1.getName() + "의 죄종 가격: " + p1.calculatePrice());
//		System.out.println(p1.getName() + "의 죄종 가격: " + p1.getPrice());
		System.out.println(p2.getName() + "의 죄종 가격: " + p2.getPrice());
	}
}
