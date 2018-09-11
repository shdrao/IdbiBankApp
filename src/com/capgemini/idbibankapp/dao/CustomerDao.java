package com.capgemini.idbibankapp.dao;

import com.capgemini.idbibankapp.model.Customer;

public interface CustomerDao {
	public Customer authenticate(Customer customer);

	public Customer updateProfile(Customer customer);

	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);

}
