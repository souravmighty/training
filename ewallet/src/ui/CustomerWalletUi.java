package ui;

import java.util.Collection;
import java.util.Set;

import dao.CustomerWalletDaoImpl;
import service.CustomerWalletServiceImpl;
import service.ICustomerWalletService;
import entities.CustomerWallet;

public class CustomerWalletUi {
	
	private ICustomerWalletService service =new CustomerWalletServiceImpl(new CustomerWalletDaoImpl());
	
	public static void main(String[] args) {
		CustomerWalletUi ui=new CustomerWalletUi();
		ui.runUi();
	}

	private void runUi() {
		try {
			CustomerWallet c1= new CustomerWallet("1234567890","Sourav");
			CustomerWallet c2= new CustomerWallet("0987654321","Sujay");
			c1.addBalance(1000);
			c2.addBalance(1000);
			service.addCustomerWallet(c1);
			service.addCustomerWallet(c2);
			CustomerWallet fetched1=service.findByMobileNo("1234567890");
			CustomerWallet fetched2=service.findByMobileNo("0987654321");
			System.out.println(fetched1.getName());
			System.out.println(fetched2.getName());
			System.out.println("********printing all customer wallets*********");
			Set<CustomerWallet> customers=service.allCustomerWallets();
			print(customers);
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("something went wrong.");
		}
		
	}
	
	void print(Collection<CustomerWallet>customers)
	{
		for(CustomerWallet c:customers)
		{
			System.out.println(c.getName()+"  "+c.getBalance());
		}
	}

}
