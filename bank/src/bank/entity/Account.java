package bank.entity;

public class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void transferAmount(Account a, double amount) {
		System.out.println("Transfering Rs." + amount + " from " + this.getName() + " to " + a.getName() + "...");
		if (this.getBalance() >= amount) {
			a.addBalance(amount);
			balance = balance - amount;
			System.out.println("Transaction Successful.\n");
		} else
			System.out.println("Transaction Failed.\n");

	}

}
