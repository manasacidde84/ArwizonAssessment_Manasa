package com.arwizon.service;

import java.util.Set;

import com.arwizon.model.Customer;


public interface AdminInterface {
	
	public Customer addCustomer(String name,String address,String accountType);
	public Set<Customer> searchCustomer(String name,Set<Customer> c);
	public Set<Customer> deleteCustomer(int customerId,Set<Customer> c);
	public void update(int customerId,String address,Set<Customer> c);

	


}
