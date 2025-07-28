package homework.homework6;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account("123-456-789", 100000);
		Account acc2 = new Account("987-654-321", 50000);
		
		// acc1계좌에서 30000원 출금
		acc1.withdraw(30000);
		// acc2계좌에서 100000원 입금
		acc2.deposit(100000);
		
		// acc1 -> acc2로 계좌이체
		// Bank 객체는 게산만 해주는 역할
		Bank bank = new Bank();
		bank.Transfer(acc1, acc2, 50000);
		
		acc1.getter();
		acc2.getter();
	}
}
