package com.arwizon.model;

public class Customer implements Comparable<Customer> {
	
	private String name;
	private  int customerId;
	private  String address;
	private  String accountType;
	
private static int count=1;
	
	public Customer() {
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", address=" + address + ", accountType="
				+ accountType + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if(this.getName().compareTo(o.getName())>0)
			return 1;
		else if(this.getName().compareTo(o.getName())<0)
			return -1;
		else
		return 0;
	}

	

}
