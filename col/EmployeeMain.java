package col;

import java.util.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		EmployeeMain ui =new EmployeeMain();
		ui.execute();
		
	}
	
	Map<Integer,Employee> store=new HashMap<>();
	
	public void execute()
	{
		Employee e1= new Employee(1,"Sourav");
		Manager m1= new Manager(2,"Sujay");
		e1.addSalary(1000);
		m1.addSalary(2000);
		store.put(1, e1);
		store.put(2, m1);
		m1.addManagedEmployees(e1);
		print();
		Employee fetched=findById(2);
		System.out.println(fetched.getName());
		
		
	}
	
	public Employee findById(int id)
	{
		Employee e=store.get(id);
		return e;
	}
	
	public void print()
	{
		Set<Integer> keys = store.keySet();
		for(Integer id:keys)
		{
			Employee e =store.get(id);
			System.out.println(e.getName()+" "+e.getBalance());
			
			if(e instanceof Manager)
			{
				Manager m=(Manager)e;
				System.out.println("Managed Employees:");
				Employee[] managedEmployees=m.getManagedEmployees();
				for(Employee managed:managedEmployees)
				{
					if(managed!=null)
						System.out.println(managed.getName()+" "+managed.getBalance());
				}
			}
			
		}
	}

}
