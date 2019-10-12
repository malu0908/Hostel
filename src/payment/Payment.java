package payment;

import java.time.LocalDateTime;

public class Payment {
	protected double amount;
	protected LocalDateTime dateTime;
	
	public Payment createPayment(String type) {		
		if(type == "CashPayment")
			return (Payment) new  CashPayment();
		else if(type == "CheckPayment")
			return (Payment) new  CheckPayment();
		else if(type == "CreditCardPayment")
			return (Payment) new  CreditCardPayment();
		return new Payment();
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
