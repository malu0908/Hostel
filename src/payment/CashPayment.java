package payment;

public class CashPayment extends Payment{
	private double amountTendered;

	
	@Override
	public String toString() {
		return "CashPayment [amountTendered=" + amountTendered + "]";
	}
}
