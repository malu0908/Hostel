package domain;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Hostel {
	public static final Hostel INSTANCE = new Hostel();
    private String name;
    private String phone;
    private List<Customer> customers;
    private List<Room> rooms;
    
    private Hostel()
    {
    	customers = new LinkedList<>();
    	rooms = new LinkedList<>();
    }   
    public static Hostel getHostel()
    {
        return INSTANCE;
    } 
    
    public boolean createCustomer(String title, String name, String lastName, String dateOfBirth, String address,String zipCode, String city, String state, String country,String email) throws RuleViolatedException
    {
    	if(title != "Mr." && title != "Mrs." && title != "Miss." && title != "Ms.")
    		throw new RuleViolatedException("Invalid title!");
    	
    	if(name == "" || lastName == "" || address == "" || state == "" || zipCode == "" || country == "" || email == "")
    		throw new RuleViolatedException("Key field null!");
    	
    	if(name.length() <= 3)
    		throw new RuleViolatedException("Name too short!"); 
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate date = LocalDate.parse(dateOfBirth,formatter);
    	
    	Customer customer = new Customer(title,name,lastName,date);
    	customer.setAddress(address, zipCode, city, state, country);
    	customers.add(customer);
    	   	
    	return true;
    }
     
    public boolean makeReservation(Customer customer, String rsDate, String checkIn, String checkOut)
    {
        return true;
    }
    
    public boolean makePayment(double amountTendered, String typeOfPayment) {
    	return true;
    }
    
    public boolean createRoom(int number, double dimension)   
    {
    	Room room = new Room();
    	room.setNumber(number);
    	room.setDimension(dimension);
    	if(rooms.contains(room) || dimension < 0.0)
    		return false;
    	addRoom(room);
    	return true;
    }
    
    public void addRoom(Room room)
    {
    	rooms.add(room);
    }
    
    public Room searchRoomByNumber(int number) throws RoomNotFoundException
    {
        throw new RoomNotFoundException("Room not found!", number);
    }
    
	public Customer searchCustomerByName(String name, String lastName) throws CustomerNotFoundException
    {
		throw new CustomerNotFoundException("Client not found", name, lastName);
    }
    
    public Customer searchReservationByCustomerName(String name, String lastName) throws ReservationNotFoundException
    {
    	throw new ReservationNotFoundException("Reservation not found!", name, lastName);
    }
    
    public Set<Reservation> searchReservations(String name, String lastName)
    {
        return null;
    }
    
    public List<Customer> getCustomers() {
    	return customers;
    }
    
    public List<Room> getRooms() {
    	return rooms;
    }
    
    public String getName() {
  		return name;
  	}
    
    public String getPhone() {
  		return phone;
  	}
      
  	public void setName(String name) {
  		this.name = name;
  	}
  	
  	public void setPhone(String phone) {
  		this.phone = phone;
  	}
  	
}
