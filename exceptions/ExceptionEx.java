package exceptions;

import col.Employee;

public class ExceptionEx {
	private Employee employee=new Employee(-23,"Sourav");
	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		//ex.execute();
		try {
			ex.execute2();
		}catch(IncorrectIdException e) {
			System.out.println("id was incorrect.");
		}
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}
		finally {
			System.out.println("I always get executed.");
		}
		
		System.out.println("after execute in main");
	}
	
	public void execute() {
		try
		{
			//int id=employee.getId();
			Throwable t=new NullPointerException();
			throw t;
			//throw new NullPointerException();//in one line.
			//System.out.println("Inside try");//after throwing exception we can't write any lines.
		}catch(Throwable e)
		{
			System.out.println("After Exception Handling");
		}
		System.out.println("Exception handled");
	}
	
	public void execute2() throws RuntimeException
	{
		if(employee.getId()<0)
		{
			RuntimeException e=new IncorrectIdException("id can't be negative.");
			throw e;
		}
		
	}

}
