
//inheritance "Account" class

public class AccountBusiness extends Account {
	
	private Double loanLimit; // this atribute dont exist in "Account" class

	public AccountBusiness() {
		super(); //make logic the main class "Account"
		
	}

	public AccountBusiness(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	
	
	
	
}
