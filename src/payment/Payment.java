package payment;

import java.time.LocalDateTime;

public class Payment {
	protected double amount;
	protected LocalDateTime dateTime;
	
	public Payment createPayment(String type) {		
		return null;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
}
