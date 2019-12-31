package service;

import java.util.Set;

import dao.IGuestDao;
import entities.Guest;
import exceptions.IncorrectIdException;

public class GuestServiceImpl implements IGuestService{
	
	IGuestDao dao;
	
	

	public GuestServiceImpl(IGuestDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void addGuest(Guest g) {
		dao.addGuest(g);
		
	}

	@Override
	public Guest findById(int id) {
		if(id<0)
		{
			throw new IncorrectIdException("Incorrect id.");
		}
		Guest g=dao.findById(id);
		return g;
	}

	@Override
	public Set<Guest> allGuests() {
		Set<Guest> g=dao.allGuests();
		return g;
	}

	@Override
	public Set<Guest> allGuestInOrder(boolean order) {
		Set<Guest> g=dao.allGuestInOrder(order);
		return g;
	}
	

}
