package service;

import java.util.Set;

import entities.CustomerWallet;
import exceptions.IncorrectMobileNoException;

public interface ICustomerWalletService {
	
	void addCustomerWallet(CustomerWallet c);
	
	CustomerWallet findByMobileNo(String no) throws IncorrectMobileNoException;
	
	Set<CustomerWallet> allCustomerWallets();

}
