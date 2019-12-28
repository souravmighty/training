
public class EmployeeMain {
	public void printEmployeesDetails(Employee store[])
	{
		System.out.println("Employee Details:\n");
		for(int i=0;i<store.length;i++)
		{
			System.out.println("ID: "+store[i].getId());
			System.out.println("Name: "+store[i].getName());
			System.out.println("Balance: "+store[i].getBalance());
			if(store[i] instanceof Manager)
			{
				Manager m=new Manager();
				m=(Manager) store[i];
				System.out.println("Managed Employees:");
				Employee[] employees=m.getManagedEmployees();
				for(int j=0; j<employees.length; j++)
				{
					System.out.println(employees[j].getName());
				}
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		
		Employee store[]=new Employee[3];
		store[0]=new Employee(1,"Sourav");
		store[1]=new Employee(2,"Sujay");
		Manager m1=new Manager(3,"Neeraj");
		store[2]=m1;
		store[0].addSalary(1000);
		store[1].addSalary(2000);
		store[2].addSalary(3000);
		m1.addManagedEmployees(store[0]);
		m1.addManagedEmployees(store[1]);
		EmployeeMain e=new EmployeeMain();
		e.printEmployeesDetails(store);
	}

}
