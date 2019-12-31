package exceptions;

public class CustomerWalletNotFoundException extends RuntimeException{
	
	public CustomerWalletNotFoundException(String msg)
	{
		super(msg);
	}

}
