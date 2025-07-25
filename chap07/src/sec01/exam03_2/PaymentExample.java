package sec01.exam03_2;

public class PaymentExample {

	public static void main(String[] args) {
		CardPayment cardPayment = new CardPayment();
		cardPayment.pay(50000);
		
		BankTransferPayment bankPayment = new BankTransferPayment();
		bankPayment.pay(50000);
		
		PaypalPayment paypalPayment = new PaypalPayment();
		paypalPayment.pay(50000);
		
	}

}
