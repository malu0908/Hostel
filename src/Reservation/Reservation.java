package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;

public class Reservation {
	private String reservationCode;
	private int numberOfGuests;
	private LocalDate reservationDate;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private Payment payment;
	private ArrayList<Room> rooms = new ArrayList();

	public Reservation() {

	}

	public Reservation(int numberOfGuests, String reservationCode, String checkin, String checkout) {
		this.numberOfGuests = numberOfGuests;
		this.reservationCode = reservationCode;
		this.reservationDate = LocalDate.now();

		String str1[] = checkin.split("/");
		int dayIn = Integer.parseInt(str1[1]);
		int monthIn = Integer.parseInt(str1[0]);
		int yearIn = Integer.parseInt(str1[2]);

		this.checkinDate = LocalDate.of(yearIn, monthIn, dayIn);

		String str2[] = checkout.split("/");
		int dayOut = Integer.parseInt(str2[1]);
		int monthOut = Integer.parseInt(str2[0]);
		int yearOut = Integer.parseInt(str2[2]);

		this.checkoutDate = LocalDate.of(yearOut, monthOut, dayOut);

	}

	Payment createPayment(String type) {
		payment = new Payment();
		return payment.createPayment(type);

	}

	double calculateTotalAmount() {
		int i = 0;
		double sum = 0.0;
		while (!rooms.isEmpty()) {
			sum = sum + rooms.get(i).getRate().getPrice();
		}
		Period p = Period.between(this.checkinDate, this.checkoutDate);
		return sum * p.getDays();
	}

	public ArrayList<Room> getRooms() {
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

}
