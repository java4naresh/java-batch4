package serialization;

public class HDFBankCustomer extends HDFCCustomer {
   
	private String products;

	public HDFBankCustomer() {
		super();
	}

	public HDFBankCustomer(String products) {
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
		return "HDFBankCustomer [products=" + products + "]";
	}

	

	
	
	
}
