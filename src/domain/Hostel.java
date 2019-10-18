package domain;
import java.util.*;
import java.util.Set;

public class Hostel {
	public static final Hostel INSTANCE = new Hostel();
    private String name;
    private String phone;
    private List<Customer> customers = new ArrayList<>();
    
    private Hostel()
    {
        
    }   
    public static Hostel getHostel()
    {
        return INSTANCE;
    } 
    
    public boolean createCustomer(String title, String firstName, String lastName, String dateOfBirth, String adress,String zipCode, String city, String state, String country,String email)
    {
        return true;
    }
    
    public boolean makeReservation(Customer customer, String rsDate, String checkIn, String checkOut)
    {
        return true;
    }
    
    
    public boolean createRoom(int number, double dimension)
    {
        return true;
    }
    
    public void addRoom(Room room)
    {
        
    }
    
    public Room searchRoomByNumber(int number) throws RoomNotFoundException
    {
        return null;
    }
    
    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Customer searchCustomerByName(String name, String lastName) throws CustomerNotFoundException
    {
        return null;
    }
    
    public Customer searchReservationByCustomerName(String name, String lastName) throws ReservationNotFoundException
    {
        return null;
    }
    
    public Set<Reservation> searchReservations(String name, String lastName)
    {
        return null;
    }
    
    public List<Customer> getCustomers() {
    	return customers;
    }
}
