package sec02.exam03_2;

public class PaymentExample {

	public static void main(String[] args) {
//		CardPayment cardPayment = new CardPayment();
//		cardPayment.pay(50000);
//		
//		BankTransferPayment bankPayment = new BankTransferPayment();
//		bankPayment.pay(50000);
//		
//		PaypalPayment paypalPayment = new PaypalPayment();
//		paypalPayment.pay(50000);
//		
		// 다형성 사용
		PaymentService payment;
		
		payment = new CardPayment();
		payment.pay(50000);
		
		payment = new PaypalPayment();
		payment.pay(50000);
		
		payment = new BankTransferPayment();
		payment.pay(50000);
		
		
	}

}
