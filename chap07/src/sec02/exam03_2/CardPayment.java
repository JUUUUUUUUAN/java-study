package sec02.exam03_2;

// 자식 클래스: 신용카드 결제
public class CardPayment extends PaymentService {
	public void pay(int amount) {
		System.out.println("카드결제 결제 선택됨");
		System.out.println("카드사 승인 요청 중...");
		System.out.println("카드로" + amount + "원 결제 완료");
	}
	

}
