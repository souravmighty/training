package col;

import java.util.*;

public class MapEx {
	
	public static void main(String[] args) {
		Map<Integer,Employee> map=new TreeMap<>(new IntegerComparator());
		//Map<Integer,Employee> map=new LinkedHashMap<>();
		//Map<Integer,Employee> map=new HashMap<>();
		Employee e1=new Employee(1,"Sourav");
		Employee e2=new Employee(2,"Sujay");
		map.put(e2.getId(),e2);
		map.put(e1.getId(),e1);
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		MapEx ex=new MapEx();
		ex.printByEntries(map);
	
	}
	
	public void print(Map<Integer,Employee> map)
	{
		Set<Integer>keys=map.keySet();
		for(int key:keys)
		{
			Employee value=map.get(key);
			System.out.println(value.getId()+" "+value.getName());
		}
	}
	
	public void printByEntries(Map<Integer,Employee>map)
	{
		Set<Map.Entry<Integer, Employee>>entries=map.entrySet();
		for(Map.Entry<Integer, Employee>entry:entries)
		{
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getId()+" "+value.getName());
		}
	}
	
	public void printByValue(Map<Integer,Employee>map)
	{
		Collection<Employee>values=map.values();
		for(Employee e:values)
		{
			System.out.println(e.getId()+" "+e.getName());
		}
	}

}
