package homework.homework6;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {}
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void getter() {
		System.out.println(accountNumber + "계좌의 현재 잔액: " + balance);
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
