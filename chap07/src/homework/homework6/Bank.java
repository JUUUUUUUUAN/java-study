package homework.homework6;

public class Bank{
	void Transfer(Account sender, Account receiver, int amount){
		sender.withdraw(amount);
		receiver.deposit(amount);
	}
}
