package com.arwizon.service;

import java.util.HashSet;
import java.util.Set;

import com.arwizon.model.Customer;



public class AdminInterfaceImpl implements AdminInterface {

	@Override
	public Customer addCustomer(String name, String address, String accountType) {
		Customer c = new Customer();
		c.setName(name);
		c.setAddress(address);
		c.setCustomerId(c.getCount());
		c.setAccountType(accountType);
		return c;
		
	}

	@Override
	public Set<Customer> searchCustomer(String name, Set<Customer> c) {
		Set<Customer> c1= new HashSet();
		for(Customer cst:c) {
			if(cst.getName().equals(name)) {
				c1.add(cst);	}
		}
		return c1;
	}

	@Override
	public Set<Customer> deleteCustomer(int customerId, Set<Customer> c) {
		for(Customer c2:c) {
			if(c2.getCustomerId()==customerId) {
				c.remove(c2);
				break;
			}
		}
		
		return c;
	}

	@Override
	public void update(int customerId, String address, Set<Customer> c) {
		for(Customer c3:c) {
			if(c3.getCustomerId()==customerId) {
				c3.setAddress(address);
				break;
			}
		}
		
	}

}
