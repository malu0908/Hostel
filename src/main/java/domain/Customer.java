package domain;

import java.time.LocalDate;
import java.util.*;

public class Customer {
	//cometario costumer
	private String title;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private String email;
	private Address address;
	private Set<Reservation> reservations;

	public Customer(String title) {
		this(title, null);
	}

	public Customer(String title, String firstname) {
		this(title, firstname, null);
	}

	public Customer(String title, String firstname, String lastname) {
		this(title, firstname, lastname, null);
	}

	public Customer(String title, String firstname, String lastname, LocalDate birthday) {
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;	
		this.birthday = birthday;
		reservations = new HashSet<>();
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
	

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Reservation reservation) {
		this.reservations.add(reservation);
	}


	public boolean equals(String name, String lastName) {
		return (this.firstname == name && this.lastname == lastName) ? true : false;
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
		String result =  "< Customer: title = " + title + " ,firstname = " + firstname + " ,lastname = " + lastname
				+ " ,birthday = " + birthday + " ,email =" + email + " >" + "\n" +
		"Reservas do(a) cliente " + getFirstname() + ": \n";

		Iterator<Reservation> reservas = getReservations().iterator();
		while (reservas.hasNext()) {
			Reservation reservaAtual = reservas.next();

			result += "Quartos escolhidos para essa reserva: \n";
			int j = 0;
			while (j < reservaAtual.getRooms().size()) {
				result += reservaAtual.getRooms().get(j) + "\n";
				j++;
			}
		}
		
		return result;
	}
}
