package com.capgemini.idbibankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.capgemini.idbibankapp.dao.TransactionDao;
import com.capgemini.idbibankapp.model.Transaction;
import com.capgemini.idbibankapp.utils.DatabaseUtil;

public class TransactionDaoImpl implements TransactionDao {

	public TransactionDaoImpl() {
		super();

	}

	@Override
	public ArrayList<Transaction> geTransactions(long accountId) {
		ArrayList<Transaction> trans = new ArrayList<>();
		String query = "SELECT * FROM transactions where account_id=?";
		System.out.println(query);
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setLong(1, accountId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {

				Transaction t = new Transaction(result.getLong(1), result.getLong(2), result.getString(3),
						result.getDouble(4), result.getDouble(5), result.getDate(6).toLocalDate(), result.getDouble(7));
				System.out.println(t);
				trans.add(t);
				System.out.println("qweqwrw");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return trans;
	}

}
