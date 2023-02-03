package externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SBICustomer implements Externalizable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	
    private String customerId;
	
	private String customerName;
	
	private String password;
	
	private int age;
	
	public SBICustomer() {
		super();
	}

	public SBICustomer(String customerId, String customerName, String password, int age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(customerId);
		out.writeObject(customerName);
		//out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		customerId = (String) in.readObject();
		customerName = (String) in.readObject();
		//age = in.readInt();
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SBICustomer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", age=" + age + "]";
	}

	

}
