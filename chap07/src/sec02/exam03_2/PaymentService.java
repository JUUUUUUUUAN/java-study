package sec02.exam03_2;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스(abstract)
public abstract class PaymentService {
	
	public void pay(int amount) { 
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제를 처리합니다.");
	}
	
	
}
