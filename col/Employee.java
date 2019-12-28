package col;

public class Employee {
	
	private int id;
	private String name;
	private double balance;
	
	public Employee()
	{
		this(0,"");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void addSalary(double salary) {
		balance = balance+salary;
	}

	@Override
	public boolean equals(Object obj)
	{
		//Employee e1=new Employee(10,"Sourav");
		//Employee e2=e1;
		//boolean result = e1.equals(e2);
		if(obj==this)
			return true;
		//Employee e1=new Employee(10,"Sourav");
		//Employee e2=null;
		//boolean result = e1.equals(e2);
		//
		//Employee e1=new Employee(10,"Sourav");
		//String e2="Sourav";
		//boolean result = e1.equals(e2);
		if(obj==null || !(obj instanceof Employee))
			return false;
		//Employee e1=new Employee(10,"Sourav");
		//Employee e2=new Employee(10,"Sourav");
		//boolean result = e1.equals(e2);
		Employee e=(Employee)obj;
		return e.id==this.id;
		
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}

}
