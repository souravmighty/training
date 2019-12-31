package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import entities.Guest;
import exceptions.GuestNotFoundException;
import util.GuestComparator;

public class GuestDaoImpl implements IGuestDao{
	
	Map<Integer,Guest> store=new HashMap<>();

	@Override
	public void addGuest(Guest g) {
		store.put(g.getId(), g);
		
	}

	@Override
	public Guest findById(int id) {
		Guest g=store.get(id);
		if(g==null)
		{
			throw new GuestNotFoundException("Guest not found for id="+id);
		}
		return g;
	}

	@Override
	public Set<Guest> allGuests() {
		Collection<Guest> guests=store.values();
		Set<Guest> guestSet=new HashSet<>(guests);
		return guestSet;
	}

	@Override
	public Set<Guest> allGuestInOrder(boolean order) {
		Collection<Guest> guests=store.values();
		if(order==true)
		{
			Set<Guest> guestSet= new TreeSet<>(new GuestComparator());
			guestSet.addAll(guests);
			return guestSet;
		}
		
		return allGuests();
	}

}
