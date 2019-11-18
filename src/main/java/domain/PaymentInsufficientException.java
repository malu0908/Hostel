package domain;

public class PaymentInsufficientException extends Exception{
	public PaymentInsufficientException(String msg) {
		super(msg);
	}
}
