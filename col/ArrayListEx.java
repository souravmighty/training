package col;

import java.util.*;
;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(5);

		Object o= list.get(0);
		int firstElement=(int)o;
		
		ArrayListEx ex=new ArrayListEx();
		
		IntegerComparator comparator =new IntegerComparator();
		list.sort(comparator);
		
		ex.print(list);
		list.remove(1);
		ex.print(list);
		Object obj=1;
		list.remove(obj);
		ex.print(list);
		list.add(0,4);
		ex.print(list);
		System.out.println("size="+list.size());
		System.out.println("isEmpty="+list.isEmpty());
		System.out.println("list contains 1="+list.contains(1));
		ex.printByIterator(list);
	}
	
	
	
	public void printByIterator(List list)
	{
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext())
		{
			Integer i= iterator.next();
			System.out.println("element="+i);
		}
	}
	
	public void print(List<Integer> list)
	{
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("");
	}

}
