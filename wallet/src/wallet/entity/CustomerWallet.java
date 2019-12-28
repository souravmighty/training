package wallet.entity;

public class CustomerWallet {
	private String mobileNo;
	private String name;
	private double balance;
	
	public CustomerWallet(String mobileNo, String name) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	
	public void transferAmount(CustomerWallet c,double amount)
	{
		if(this.balance>=amount)
		{
			c.addBalance(amount);
			balance -=amount;
		}
	}
	

}
