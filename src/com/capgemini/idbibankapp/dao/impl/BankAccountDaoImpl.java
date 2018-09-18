package com.capgemini.idbibankapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Random;
import java.util.Set;

import com.capgemini.idbibankapp.dao.BankAccountDao;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.exceptions.UserNotFoundException;
import com.capgemini.idbibankapp.model.BankAccount;
import com.capgemini.idbibankapp.utils.DatabaseUtil;

public class BankAccountDaoImpl implements BankAccountDao {
	private Set<BankAccount> bankAccounts;
	Random r = new Random();

	public BankAccountDaoImpl() {
		super();
		bankAccounts = DummyDatabase.getBankAccounts();
	}

	@Override
	public double getBalance(long accountId) throws UserNotFoundException {
		String query = "select balance from bankaccounts WHERE account_id=?";
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setLong(1, accountId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				return result.getDouble(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		throw new UserNotFoundException("No Account found");
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		String query = "UPDATE bankaccounts SET balance=? WHERE account_id=?";
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setDouble(1, newBalance);
			statement.setLong(2, accountId);
			if (statement.executeUpdate() == 1) {
				return getBalance(accountId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		throw new UserNotFoundException("No Account found");
		return 0;
	}

	@Override
	public boolean addCreditInfo(long accountId, String narrator, double amount) {
		String query = "INSERT INTO transactions (transaction_id, account_id, narrator, tranc_date,credit,balance) VALUES (?,?,?,?,?,?);";
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setLong(1, 5000000 + r.nextInt(5000));
			statement.setLong(2, accountId);
			statement.setString(3, narrator);
			statement.setDate(4, Date.valueOf(LocalDate.now()));
			statement.setDouble(5, amount);
			statement.setDouble(6, getBalance(accountId));
			if (statement.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean addDebitInfo(long accountId, String narrator, double amount) {
		String query = "INSERT INTO transactions (transaction_id, account_id, narrator, tranc_date,debit,BALANCE) VALUES (?,?,?,?,?,?);";
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setLong(1, 5000000 + r.nextInt(5000));
			statement.setLong(2, accountId);
			statement.setString(3, narrator);
			statement.setDate(4, Date.valueOf(LocalDate.now()));
			statement.setDouble(5, amount);
			statement.setDouble(6, getBalance(accountId));
			if (statement.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
