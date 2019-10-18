package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Reservation {
	private String reservationCode;
	private int numberOfGuests;
	private LocalDate reservationDate;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private Payment payment;
	private List<Room> rooms;

	public Reservation() {
		this(0, null, null, null);
	}

	public Reservation(int numberOfGuests, LocalDate reservationDate, LocalDate checkin, LocalDate checkout) {
		this.numberOfGuests = numberOfGuests;
		this.reservationDate = LocalDate.now();
		this.checkinDate = checkin;
		this.checkoutDate = checkout;
		
		this.rooms = new ArrayList<>();
	}

	Payment createPayment(String type) {
		payment = new Payment();
		return payment.createPayment(type);

	}

	double calculateTotalAmount() {
		int i = 0;
		double sum = 0.0;
		while (i < rooms.size()) {
			sum = sum + rooms.get(i).getRate().getPrice();
			i++;
		}
		Period p = Period.between(this.checkinDate, this.checkoutDate);
		return sum * p.getDays();
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void addRooms(Room room) {
		rooms.add(room);
	}

	public String getReservationCode() {
		return reservationCode;
	}

	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDate checkInDate) {
		this.checkinDate = checkInDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkoutDate = checkOutDate;
	}

	public String toString() {
		return "< Reservation: reservationDate = " + this.reservationDate + ", checkinDate = " + this.checkinDate + ", checkoutDate = " + this.checkoutDate + " >";
	}
}
