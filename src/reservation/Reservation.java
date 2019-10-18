package reservation;

import payment.Payment;
import java.time.LocalDate;

public class Reservation {
	private String reservationCode;
	private int numberOfGuests;
	private LocalDate reservationDate;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private Payment payment;

	public Reservation(int numberOfGuests, String reservationCode, String checkin, String checkout) {
		this.numberOfGuests = numberOfGuests;
		this.reservationCode = reservationCode;
		this.reservationDate = LocalDate.now();

		String str1[] = checkin.split("/");
		int dayIn = Integer.parseInt(str1[1]);
		int monthIn = Integer.parseInt(str1[0]);
		int yearIn = Integer.parseInt(str1[2]);

		this.checkinDate = LocalDate.of(yearIn, monthIn, dayIn);

		String str2[] = checkin.split("/");
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
		return 0.0;

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

	public void setReservationDate(int year, int month, int day) {
		this.reservationDate = LocalDate.of(year, month, day);
	}

	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(int year, int month, int day) {
		this.checkinDate = LocalDate.of(year, month, day);
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(int year, int month, int day) {
		this.checkoutDate = LocalDate.of(year, month, day);
	}
	
}
