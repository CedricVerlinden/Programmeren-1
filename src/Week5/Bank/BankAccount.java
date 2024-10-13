package Week5.Bank;

public class BankAccount {

	private String holder;
	private String iban;
	private double balance;

	public BankAccount(String holder, String iban, double balance) {
		this.holder = holder;
		this.iban = iban;
		this.balance = balance;
	}

	public BankAccount(String holder, String iban) {
		this(holder, iban, 0.0);
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}

		return false;
	}

	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) {
			return false;
		}

		balance -= amount;
		return true;
	}

	public String getHolder() {
		return holder;
	}

	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "De rekening " + iban + " op naam van " + holder + " heeft een saldo van €" + balance;
	}
}
