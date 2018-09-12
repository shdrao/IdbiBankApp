package com.capgemini.idbibankapp.service.impl;

import java.util.Set;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	@Override
	public Customer authenticate(Customer customer) {
		Set<Customer> customers = customerDao.getCustomers();
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				if (customer1.getPassword().equals(customer.getPassword())) {
					return customer1;
				} else {
					return null;
				}
			}
		}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		Set<Customer> customers = customerDao.getCustomers();
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {

				customer1.setAddress(customer.getAddress());
				customer1.setCustomerName(customer.getCustomerName());
				customer1.setDateOfBirth(customer.getDateOfBirth());
				customer1.setEmail(customer.getEmail());
				customerDao.setCustomers(customers);
				return customer1;
			}

		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		Set<Customer> customers = customerDao.getCustomers();
		for (Customer customer1 : customers) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				if (customer1.getPassword().equals(oldPassword)) {
					customer1.setPassword(newPassword);
					customerDao.setCustomers(customers);
					return true;
				}

			}
		}
		return false;

	}

}
