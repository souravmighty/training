package entities;


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
	
	@Override
	public String toString() {
		return "CustomerWallet [mobileNo=" + mobileNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return  mobileNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			{
			return true;
			}
		if (obj == null || !(obj instanceof CustomerWallet))
			{
			return false;
			}
		CustomerWallet c = (CustomerWallet) obj;
		return c.getMobileNo().equals(this.getMobileNo());
	}

}
