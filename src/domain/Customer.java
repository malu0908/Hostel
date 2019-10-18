package domain;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Customer {
	private String title;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private String email;
	private Address address;
	private List<Reservation> reservations;

	public Customer(String title) {
		this.title = title;
		reservations = new LinkedList<>();
	}

	public Customer(String title, String firstname) {
		this.title = title;
		this.firstname = firstname;
		reservations = new LinkedList<>();
	}

	public Customer(String title, String firstname, String lastname) {
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		reservations = new LinkedList<>();
	}

	public Customer(String title, String firstname, String lastname, LocalDate birthday) {
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		reservations = new LinkedList<>();
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
	
	public Address getAddress()
	{
		return address;
	}
	
	public void setAddress(String address, String zipCode, String city, String state, String country) {
		this.address = new Address(address, zipCode, city, state, country);
	}
	

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Reservation reservation) {
		this.reservations.add(reservation);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (!this.title.equals(other.title) || !this.firstname.equals(other.firstname)
				|| !this.lastname.equals(other.lastname) || !this.birthday.equals(other.birthday)
				|| !this.email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + title.hashCode();
		result = 31 * result + firstname.hashCode();
		result = 31 * result + lastname.hashCode();
		result = 31 * result + birthday.hashCode();
		result = 31 * result + email.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "< Customer: title = " + title + " ,firstname = " + firstname + " ,lastname = " + lastname
				+ " ,birthday = " + birthday + " ,email =" + email + " >";
	}
}
