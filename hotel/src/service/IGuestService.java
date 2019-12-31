package service;

import java.util.Set;

import entities.Guest;

public interface IGuestService {
	
void addGuest(Guest g);
	
	Guest findById(int id);
	
	Set<Guest> allGuests();
	
	Set<Guest> allGuestInOrder(boolean order);

}
