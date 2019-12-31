package service;

import java.util.Set;

import dao.ICustomerWalletDao;
import entities.CustomerWallet;
import exceptions.IncorrectMobileNoException;

public class CustomerWalletServiceImpl implements ICustomerWalletService{
	
	private ICustomerWalletDao dao;
	
	public CustomerWalletServiceImpl(ICustomerWalletDao dao) {
		this.dao=dao;
	}

	@Override
	public void addCustomerWallet(CustomerWallet c) {
		dao.addCustomerWallet(c);
		
	}

	@Override
	public CustomerWallet findByMobileNo(String no)throws IncorrectMobileNoException {
		if(no.length()!=10 || no==null)
		{
			throw new IncorrectMobileNoException("Mobile no is incorrect.");
		}
		CustomerWallet c=dao.findByMobileNo(no);
		return c;
	}

	@Override
	public Set<CustomerWallet> allCustomerWallets() {
		Set<CustomerWallet> customers=dao.allCustomerWallets();
		return customers;
	}

}
