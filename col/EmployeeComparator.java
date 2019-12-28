package col;
import java.util.*;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getBalance()>o2.getBalance())
			return -1;
		if(o1.getBalance()<o2.getBalance())
			return 1;
		return 0;
	}
	
	

}
