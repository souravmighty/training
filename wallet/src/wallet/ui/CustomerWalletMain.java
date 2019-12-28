package wallet.ui;

import wallet.entity.CustomerWallet;
import java.util.*;

public class CustomerWalletMain {
	
	public static void main(String[] args) {
		CustomerWalletMain ui=new CustomerWalletMain();
		ui.execute();
	}
	
	Map<String,CustomerWallet> store=new HashMap<>();

	private void execute() {
		CustomerWallet c1= new CustomerWallet("1234567890","Sourav");
		CustomerWallet c2= new CustomerWallet("0987654321","Sujay");
		c1.addBalance(1000);
		c2.addBalance(1000);
		store.put(c1.getMobileNo(), c1);
		store.put(c2.getMobileNo(), c2);
		print();
		CustomerWallet fetched=findByMobileNo("1234567890");
		System.out.println("Fetched Details: "+fetched.getMobileNo()+" "+fetched.getName()+" "+fetched.getBalance()+"\n");
		c1.transferAmount(c2, 100);
		print();
	}
	
	public CustomerWallet findByMobileNo(String mob)
	{
		CustomerWallet c=store.get(mob);
		return c;
	}

	private void print() {
		Set<String>keys=store.keySet();
		System.out.println("Customer Wallet Details:");
		for(String mob:keys)
		{
			CustomerWallet c=store.get(mob);
			System.out.println(c.getMobileNo()+" "+c.getName()+" "+c.getBalance());
		}
		System.out.println("");
		
	}

}
