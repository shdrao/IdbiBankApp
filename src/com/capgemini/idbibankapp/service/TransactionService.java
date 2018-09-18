package com.capgemini.idbibankapp.service;

import java.util.ArrayList;

import com.capgemini.idbibankapp.model.Transaction;

public interface TransactionService {
	public ArrayList<Transaction> getTransactions(long accountId);

}
