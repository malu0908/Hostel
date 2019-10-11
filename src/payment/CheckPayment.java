package payment;

public class CheckPayment extends Payment {
	private String bankId;
	private String bankName;
	private String branchNumber;
	
	@Override
	public String toString() {
		return "CheckPayment [bankId=" + bankId + ", bankName=" 
				+ bankName + ", branchNumber=" + branchNumber + "]";
	}	
}
