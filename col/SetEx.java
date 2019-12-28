package col;

import java.util.*;

public class SetEx {
	public static void main(String[] args) {
		Employee e5=new Employee(4,"Diptajit");
		Employee e1=new Employee(1,"Sourav");
		Employee e2=new Employee(2,"Sujay");
		Employee e3=new Employee(3,"Neeraj");
		Employee e4=new Employee(1,"Sourav");
		e5.addSalary(82000);
		e1.addSalary(1000);
		e2.addSalary(2000);
		e3.addSalary(3000);
		e4.addSalary(1000);
//		boolean same=e1==e2;
//		System.out.println("e1 and e2 same="+same);
//		boolean equals=e1.equals(e2);
//		System.out.println("e1 equals e2="+equals);
		EmployeeComparator comparator= new EmployeeComparator();
		Set<Employee> set=new TreeSet(comparator);
		//Set<Employee> set=new LinkedHashSet();
		//Set set=new HashSet();
	
		set.add(e1);
		set.add(e3);
		set.add(e5);
		set.add(e2);
		set.add(e4);
		System.out.println("Size="+set.size());
		System.out.println("Set contains e2="+set.contains(e2));
		SetEx ex=new SetEx();
		ex.print(set);
		boolean removed=set.remove(e2);
		System.out.println("removed="+removed);
		ex.print2(set);
		
	}
	
	public void print(Set set)
	{
		for(Object obj:set)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+" "+e.getName());
		}
	}
	public void print2(Set<Employee> set)
	{
		for(Employee e:set)
		{
			System.out.println(e.getId()+" "+e.getName());
		}
	}

}
