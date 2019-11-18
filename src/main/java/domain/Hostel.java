package domain;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Hostel {
	//teste de master para mater/origin via commit and push
	public static final Hostel INSTANCE = new Hostel();
    private String name;
    private String phone;
    private List<Customer> customers;
    private List<Room> rooms;
    private Set<Reservation> reservations;
    
    private Hostel()
    {
    	customers = new LinkedList<>();
    	rooms = new LinkedList<>();
    	reservations = new HashSet<>();
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
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate date1 = LocalDate.parse(rsDate,formatter);
    	
    	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate date2 = LocalDate.parse(checkIn,formatter2);
    	
    	DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate date3 = LocalDate.parse(checkOut,formatter3);

    	Reservation reservation = new Reservation(0, date1, date2, date3);
    	
        customer.setReservations(reservation);      
        reservations.add(reservation);
        
        return true;
    }
    
    public boolean makePayment(double amountTendered,
    	String typeOfPayment, Reservation reserv) throws PaymentInsufficientException{
    	Payment payment = reserv.createPayment(typeOfPayment);
    	payment.setAmount(reserv.calculateTotalAmount());
    	if(amountTendered < payment.getAmount())
    		throw new PaymentInsufficientException("Valor insuficiente para pagamento"); 
    	return true;
    }
    
    public boolean createRoom(int number, double dimension)   
    {
    	Room room = new Room(number, dimension);
    	if(rooms.contains(room) || dimension < 0.0)
    		return false;
    	addRoom(room);
    	return true;
    }
    
    public void addRoom(Room room)
    {
    	rooms.add(room);
    }
    
    @SuppressWarnings("unlikely-arg-type")
	public Room searchRoomByNumber(int number) throws RoomNotFoundException
    {
    	for(int i = 0;i< rooms.size();i++)
    	{
    		Room n = new Room(number, 0.0);
    		if(rooms.get(i).equals(n))
    			return rooms.get(i);
    	}
        throw new RoomNotFoundException("Room not found!", number);
    }
    
	public Customer searchCustomerByName(String name, String lastName) throws CustomerNotFoundException
    {
		for(int i = 0;i< customers.size();i++)
		{
			if(customers.get(i).equals(name,lastName))
    			return customers.get(i);
		}
		throw new CustomerNotFoundException("Client not found", name, lastName);
    }
    
    public Set<Reservation> searchReservationByCustomerName(String name, String lastName) throws ReservationNotFoundException
    {
    	for(int i = 0;i< customers.size();i++)
		{   
			if(customers.get(i).equals(name,lastName))
			{
				return customers.get(i).getReservations();
			}
		}
    	throw new ReservationNotFoundException("Reservation not found!", name, lastName);
    }
    
    public Set<Reservation> searchReservations(String name, String lastName)
    {
    	for(int i = 0;i< customers.size();i++)
		{
			if(customers.get(i).equals(name,lastName))
    			return customers.get(i).getReservations();
		}
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
  	
  	public Set<Reservation> getReservations() {
  		return this.reservations;
  	}
  	
}
