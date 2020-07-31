package com.arwizon.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.arwizon.model.Customer;
import com.arwizon.service.AdminInterface;
import com.arwizon.service.AdminInterfaceImpl;
import com.arwizon.utility.Utilities;

public class TestBanking {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Set<Customer> m = new HashSet<Customer>();
		AdminInterface ad = new AdminInterfaceImpl();

		while(true) {
			System.out.println("Press 1 to add customer" 
					+"\nPress 2 to display customer details"
					+"\nPress 3 to search customer details"
					+"\nPress 4 to update customer details"
					+"\nPress 5 to delete the customer");

			System.out.println("Please choose  your option");
			int ch = scn.nextInt();
			switch(ch) {
			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter customer name");
					name = scn.next();
					try {
						Utilities.validateChar(name);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}

				String address = null;
				while (true) {
					System.out.println("Enter address");
					address = scn.next();
					try {
						Utilities.validateChar(address);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}

				String accountType = null;
				while (true) {
					System.out.println("Enter account type");
					accountType= scn.next();
					try {
						Utilities.validateChar(accountType);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}


				Customer c = ad.addCustomer(name, address, accountType);
				m.add(c);
				break;

			case 2:

				for(Customer c1 :m) {
					System.out.println(c1);
				}

				break;




							case 3:
								System.out.println("please enter customer name");
								String name1=scn.next();
				
								Set<Customer> customer = ad.searchCustomer(name1,m);
								if(customer.size()==0) {
									System.out.println("Customer name not found");
								}else {
									for(Customer c1:customer) {
										System.out.println(c1);
									}
								}
				
				
								break;
							case 4:
								System.out.println("Enter Customer Id");
								String custId = scn.next();
								int custId2 = Integer.parseInt(custId);
								System.out.println("Enter your Updated address");
								String address1 = scn.next();
								ad.update(custId2, address1,m);
				
								break;
							case 5:
								System.out.println("Enter Customer Id");
								String customerId = scn.next();
								int customerId1 = Integer.parseInt(customerId );
								m =ad.deleteCustomer(customerId1,m);
				
								for(Customer c3:m) {
									System.out.println(c3);
								}
				
								break;
				
							default:System.out.println("Invalid option");
				

			}
		}
	}


}
