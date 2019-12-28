
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


	
	

}
