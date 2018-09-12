package com.capgemini.idbibankapp.dao;

public interface BankAccountDao {
	public double getBalance(long accountId);

	public double updateBalance(long accountId, double newBalance);


}
