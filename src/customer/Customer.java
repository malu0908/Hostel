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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
