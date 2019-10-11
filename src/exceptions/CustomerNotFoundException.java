package exceptions;

public class CustomerNotFoundException extends Exception{
	private String name;
	private String lastName;
	
	public CustomerNotFoundException(String message, String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
}
