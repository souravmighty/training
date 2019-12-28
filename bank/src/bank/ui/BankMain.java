package bank.ui;

import bank.entity.Account;

public class BankMain {
	public void printDetails(Account[] accounts) {
		System.out.println("Account Details:");
		for (Account acc : accounts) {
			System.out.println("ID: " + acc.getId() + " Name: " + acc.getName() + " Balance: " + acc.getBalance());
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Account[] accounts = new Account[2];
		accounts[0] = new Account(1, "Sourav");
		accounts[1] = new Account(2, "Sujay");
		accounts[0].addBalance(1000);
		accounts[1].addBalance(1000);
		BankMain b = new BankMain();
		b.printDetails(accounts);
		accounts[0].transferAmount(accounts[1], 100);
		b.printDetails(accounts);

	}

}
