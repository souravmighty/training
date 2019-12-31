package ui;

import java.util.Set;

import dao.GuestDaoImpl;
import entities.Guest;
import exceptions.GuestNotFoundException;
import exceptions.IncorrectIdException;
import service.GuestServiceImpl;
import service.IGuestService;

public class GuestUi {
	
	IGuestService service= new GuestServiceImpl(new GuestDaoImpl());
	
	public static void main(String args[]) {
		
		GuestUi ui=new GuestUi();
		ui.runUi();

	}

	private void runUi() {
		try {
		Guest g2=new Guest(2,"Sujay");
		Guest g1=new Guest(1,"Sourav");
		Guest g3=new Guest(4,"Niraj");
		Guest g4=new Guest(3,"Nandini");
		service.addGuest(g2);
		service.addGuest(g1);
		service.addGuest(g3);
		service.addGuest(g4);
		Guest fetched1=service.findById(1);
		Guest fetched2=service.findById(2);
		System.out.println(fetched1.getName());
		System.out.println(fetched2.getName());
		System.out.println("*****printing all guests*****");
		print(service.allGuests());
		System.out.println("*****printing all guests in order*****");
		print(service.allGuestInOrder(true));
		}catch(GuestNotFoundException e)
		{
			System.out.println("Guest not found.");
		}
		catch(IncorrectIdException e)
		{
			System.out.println("Incorrect id.");
		}
		catch(Throwable e)
		{
			System.out.println("something went wrong.");
		}
	}

	private void print(Set<Guest> allGuests) {
		for(Guest g:allGuests)
		{
			System.out.println(g.getId()+" "+g.getName());
		}
		
	}

}
