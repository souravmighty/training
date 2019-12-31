package dao;

import java.util.Set;

import entities.CustomerWallet;

public interface ICustomerWalletDao {
	
	void addCustomerWallet(CustomerWallet c);
	
	CustomerWallet findByMobileNo(String no);
	
	Set<CustomerWallet> allCustomerWallets();

}
