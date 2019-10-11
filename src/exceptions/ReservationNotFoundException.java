package exceptions;

public class ReservationNotFoundException extends Exception{
	private String name;
	private String lastName;
	
	public ReservationNotFoundException(String message, String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
}
