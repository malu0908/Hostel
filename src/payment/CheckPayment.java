package payment;

public class CheckPayment extends Payment {
	private String bankId;
	private String bankName;
	private String branchNumber;
	
	@Override
	public String toString() {
		return "CheckPayment [Price = " + super.amount + " Payment date = " + super.dateTime 
				+ " bankId = " + bankId + ", bankName = " 
				+ bankName + ", branchNumber = " + branchNumber + "]";
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}
}
