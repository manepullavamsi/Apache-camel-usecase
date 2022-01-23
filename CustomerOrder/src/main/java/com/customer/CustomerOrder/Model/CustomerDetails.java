package com.customer.CustomerOrder.Model;

public class CustomerDetails {
	private long customerId;
	private String customerName;
	private String customerType;
	private long customerPhone;
	private String customerEmail;
	private String customerAddress;
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ customerType + ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail
				+ ", customerAddress=" + customerAddress + "]";
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}
