package util;

import java.util.Comparator;

import entities.Guest;

public class GuestComparator implements Comparator<Guest>{

	@Override
	public int compare(Guest arg0, Guest arg1) {
		if(arg0.getId() > arg1.getId())
		{
			return 1;
		}
		if(arg0.getId() < arg1.getId())
		{
			return -1;
		}
		return 0;
	}
	
	

}
