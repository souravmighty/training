package col;

import java.util.*;

public class MapEx {
	
	public static void main(String[] args) {
		Map<Integer,Employee> map=new HashMap<>();
		Employee e1=new Employee(1,"Sourav");
		Employee e2=new Employee(2,"Sujay");
		map.put(1,e1);
		map.put(2,e2);
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		MapEx ex=new MapEx();
		ex.print(map);
	
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

}
