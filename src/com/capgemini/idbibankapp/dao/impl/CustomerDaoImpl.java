package com.capgemini.idbibankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.model.BankAccount;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.utils.DatabaseUtil;

public class CustomerDaoImpl implements CustomerDao {
//	private Connection connection;

	public CustomerDaoImpl() {
		super();
//		connection = DatabaseUtil.getConnection();
		System.out.println("ashdjkashdflhfadhfjd");
	}

	@Override
	public Customer authenticate(Customer customer) {
//		String queryJoin = "SELECT customers.customer_id,customers.customer_name, customers.customer_password, customers.customer_email, customers.customer_address, customers.customer_dob, bankaccounts.account_id, bankaccounts.account_type, bankaccounts.balance FROM customers INNER JOIN bankaccounts ON customers.customer_id = bankaccounts.customer_id AND  customers.customer_id=? AND customers.customer_password=?";
		String queryJoin = "SELECT * FROM customers INNER JOIN bankaccounts ON customers.customer_id = bankaccounts.customer_id WHERE  customers.customer_id=? AND customers.customer_password=?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement0 = connection.prepareStatement(queryJoin);) {
			statement0.setLong(1, customer.getCustomerId());
			statement0.setString(2, customer.getPassword());

			ResultSet result = statement0.executeQuery();

			while (result.next()) {
				customer.setCustomerId(result.getLong(1));
				customer.setCustomerName(result.getString(2));
				customer.setPassword(result.getString(3));
				customer.setEmail(result.getString(4));
				customer.setAddress(result.getString(5));
				customer.setDateOfBirth(result.getDate(6).toLocalDate());
				BankAccount account = new BankAccount(result.getLong(8), result.getString(9), result.getDouble(10));
				customer.setAccount(account);
			}

			return customer;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		String query = "UPDATE customers SET customer_name=?, customer_email=?, customer_address=? WHERE customer_id=?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement0 = connection.prepareStatement(query);) {
			statement0.setString(1, customer.getCustomerName());
			statement0.setString(2, customer.getEmail());
			statement0.setString(3, customer.getAddress());
			statement0.setLong(4, customer.getCustomerId());

			if (statement0.executeUpdate() == 1) {
				customer = this.getCoustomer(customer);
			}
			return customer;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		String query = "UPDATE customers SET customer_password=? WHERE customer_id=?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement0 = connection.prepareStatement(query);) {
			Customer customer1 = getCoustomer(customer);
			if (customer1.getPassword().equals(oldPassword)) {
				statement0.setString(1, newPassword);
				statement0.setLong(2, customer.getCustomerId());
			}

			if (statement0.executeUpdate() == 1) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		return false;
	}

	private Customer getCoustomer(Customer customer) {

		String queryJoin = "SELECT * FROM customers INNER JOIN bankaccounts ON customers.customer_id = bankaccounts.customer_id AND  customers.customer_id=? ";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement0 = connection.prepareStatement(queryJoin);) {
			statement0.setLong(1, customer.getCustomerId());

			ResultSet result = statement0.executeQuery();

			while (result.next()) {
				customer.setCustomerId(result.getLong(1));
				customer.setCustomerName(result.getString(2));
				customer.setPassword(result.getString(3));
				customer.setEmail(result.getString(4));
				customer.setAddress(result.getString(5));
				customer.setDateOfBirth(result.getDate(6).toLocalDate());
				BankAccount account = new BankAccount(result.getLong(8), result.getString(9), result.getDouble(10));
				customer.setAccount(account);
			}

			return customer;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
