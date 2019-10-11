package payment;

public class CashPayment extends Payment{
	private double amountTendered;

	
	@Override
	public String toString() {
		return "CashPayment [Price = " + super.amount + "Payment date = " + super.dateTime 
				+ "amountTendered=" + amountTendered + "]";
	}
}
