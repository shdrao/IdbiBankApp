package com.capgemini.idbibankapp.dao.impl;

import java.util.Set;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
private Set<Customer> customers;

	public CustomerDaoImpl() {
		super();
		customers = DummyDatabase.getCustomers();
	}

	@Override
	public Customer authenticate(Customer customer) {
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				if (customer1.getPassword().equals(customer.getPassword())) {
					return customer1;
				} else {
					return customer;
				}
			}
		}
		return customer;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {

				customer1.setAddress(customer.getAddress());
				customer1.setCustomerName(customer.getCustomerName());
				customer1.setDateOfBirth(customer.getDateOfBirth());
				customer1.setEmail(customer.getEmail());
				System.out.println(customer1);
				return customer1;
			}

		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				if (customer1.getPassword().equals(oldPassword)) {
					customer1.setPassword(newPassword);
					return true;
				}

			}
		}
		return false;

	}


}
