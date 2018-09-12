package com.capgemini.idbibankapp.service;

import com.capgemini.idbibankapp.model.Customer;

public interface CustomerService {
	public Customer authenticate(Customer customer);

	public Customer updateProfile(Customer customer);

	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);

}
