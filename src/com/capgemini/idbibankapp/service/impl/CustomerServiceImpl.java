package com.capgemini.idbibankapp.service.impl;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.dao.impl.CustomerDaoImpl;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	@Override
	public Customer authenticate(Customer customer) {
		return customerDao.authenticate(customer);
	}

	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		customerDao = new CustomerDaoImpl();
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
