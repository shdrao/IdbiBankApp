package com.capgemini.idbibankapp.dao;

import java.util.ArrayList;

import com.capgemini.idbibankapp.model.Transaction;

public interface TransactionDao {
	public ArrayList<Transaction> geTransactions(long accountId);
}
