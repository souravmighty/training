package dao;

import java.util.Set;

import entities.Guest;

public interface IGuestDao {
	
	void addGuest(Guest g);
	
	Guest findById(int id);
	
	Set<Guest> allGuests();
	
	Set<Guest> allGuestInOrder(boolean order);

}
