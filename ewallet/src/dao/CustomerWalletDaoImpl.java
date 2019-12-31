package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.CustomerWallet;
import exceptions.CustomerWalletNotFoundException;

public class CustomerWalletDaoImpl implements ICustomerWalletDao{
	
	Map<String,CustomerWallet> store=new HashMap<>();
	
	

	@Override
	public void addCustomerWallet(CustomerWallet c) {
		store.put(c.getMobileNo(),c);
	}

	@Override
	public CustomerWallet findByMobileNo(String no) {
		CustomerWallet c=store.get(no);
		if(c==null)
		{
			throw new CustomerWalletNotFoundException("Customer Wallet not found for mobile no="+no);
		}
		return c;
	}

	@Override
	public Set<CustomerWallet> allCustomerWallets() {
		Collection<CustomerWallet> customers=store.values();
		Set<CustomerWallet> customerSet=new HashSet<>(customers);
		return customerSet;
	}

}
