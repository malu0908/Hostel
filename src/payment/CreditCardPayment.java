package payment;

import java.time.LocalDate;

public class CreditCardPayment {
	private double amount;
	private String issuer;
	private String number;
	private String nameOnCard;
	private LocalDate experionDate;
	private String securityCode;
	@Override
	public String toString() {
		return "CreditCardPayment [amount=" + amount + ", issuer=" + issuer
				+ ", number=" + number +", nameOnCard="
				+ nameOnCard + ", experionDate=" + experionDate
				+ ", securityCode=" + securityCode + "]";
	}
	
	public boolean authorize() {
		return true;
	}
}
