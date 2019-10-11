package payment;

import java.time.LocalDate;

public class CreditCardPayment extends Payment {
	private double amount;
	private String issuer;
	private String number;
	private String nameOnCard;
	private LocalDate experionDate;
	private String securityCode;
	
	@Override
	public String toString() {
		return "CreditCardPayment [Price = " + super.amount + " Payment date = " + super.dateTime 
				+ " amount = " + amount + ", issuer = " + issuer
				+ ", number = " + number +", nameOnCard = "
				+ nameOnCard + ", experionDate = " + experionDate
				+ ", securityCode=" + securityCode + "]";
	}
	
	public boolean authorize() {
		return true;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public LocalDate getExperionDate() {
		return experionDate;
	}

	public void setExperionDate(LocalDate experionDate) {
		this.experionDate = experionDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
}
