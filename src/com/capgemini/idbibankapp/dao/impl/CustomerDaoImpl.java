package com.capgemini.idbibankapp.dao.impl;

import java.util.Set;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public CustomerDaoImpl() {
		super();
	}

	@Override
	public Customer authenticate(Customer customer) {
		Set<Customer> customers = DummyDatabase.getCustomers();
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
		Set<Customer> customers = DummyDatabase.getCustomers();
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {

				customer1.setAddress(customer.getAddress());
				customer1.setCustomerName(customer.getCustomerName());
				customer1.setDateOfBirth(customer.getDateOfBirth());
				customer1.setEmail(customer.getEmail());
				DummyDatabase.setCustomers(customers);
				System.out.println(customer1);
				return customer1;
			}

		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		Set<Customer> customers = DummyDatabase.getCustomers();
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				if (customer1.getPassword().equals(oldPassword)) {
					customer1.setPassword(newPassword);
					DummyDatabase.setCustomers(customers);
					return true;
				}

			}
		}
		return false;

	}


}
