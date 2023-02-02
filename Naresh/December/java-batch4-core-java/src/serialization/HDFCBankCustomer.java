package serialization;

public class HDFCBankCustomer extends HDFCCustomer {
	
	private String products;

	public HDFCBankCustomer() {
		super();
	}
	
	public HDFCBankCustomer(String products) {
		super();
		this.products = products;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "HDFCBankCustomer [products=" + products + "]";
	}

	
	
	
	
	

}
