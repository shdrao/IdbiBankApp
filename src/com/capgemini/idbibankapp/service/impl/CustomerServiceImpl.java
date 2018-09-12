package com.capgemini.idbibankapp.service.impl;

import java.util.Set;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	@Override
	public Customer authenticate(Customer customer) {
		return customerDao.authenticate(customer);
	}

	@Override
	public Customer updateProfile(Customer customer) {
		return customerDao.updateProfile(customer);
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		return customerDao.updatePassword(customer, oldPassword, newPassword);

	}

}
