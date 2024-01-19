package Products;

public class ImportedProduct extends Product{

	private Double custmsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double custmsFee) {
		super(name, price);
		this.custmsFee = custmsFee;
	}

	public Double getCustmsFee() {
		return custmsFee;
	}

	public void setCustmsFee(Double custmsFee) {
		this.custmsFee = custmsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + price;
}
	public Double totalPrice() {
		return price * 2;
	}
}
