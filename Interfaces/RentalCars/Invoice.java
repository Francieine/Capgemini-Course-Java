package model.entities;

public class Invoice {
	
	private Double baysicPayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double baysicPayment, Double tax) {
		this.baysicPayment = baysicPayment;
		this.tax = tax;
	}


	public Double getBaysicPayment() {
		return baysicPayment;
	}


	public void setBaysicPayment(Double baysicPayment) {
		this.baysicPayment = baysicPayment;
	}


	public Double getTax() {
		return tax;
	}


	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return baysicPayment + getTax();
	}

}
