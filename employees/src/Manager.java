
public class Manager extends Employee{
	private int i=0;
	private Employee[] managedEmployees= new Employee[2];
	public Manager()
	{
		
	}
	
	public Manager(int id, String name)
	{
		super(id,name);
	}

	public Employee[] getManagedEmployees() {
		return managedEmployees;
	}

	public void addManagedEmployees(Employee e) {
		managedEmployees[i]=e;
		i++;
	}
	
	

}
