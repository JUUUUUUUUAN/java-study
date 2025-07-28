package sec02.exam03_2;

public class PaypalPayment extends PaymentService {
	public void pay(int amount) {
		System.out.println("페이팔 결제 선택됨");
		System.out.println("페이팔 서버와 연결 중");
		System.out.println("카드로" + amount + "원 결제 완료");
	}
}
