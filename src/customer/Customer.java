package customer;

import java.time.LocalDate;

public class Customer {
	private String title;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private String email;
	
	public Customer(String title) {
		this.title = title;
	}
	
	public Customer(String title, String firstname) {
		this.title = title;
		this.firstname = firstname;
	}
	
	public Customer(String title, String firstname, String lastname) {
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Customer(String title, String firstname, String lastname, LocalDate birthday) {
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}
}
