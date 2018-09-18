package com.capgemini.idbibankapp.service.impl;

import java.util.ArrayList;

import com.capgemini.idbibankapp.dao.TransactionDao;
import com.capgemini.idbibankapp.dao.impl.TransactionDaoImpl;
import com.capgemini.idbibankapp.model.Transaction;
import com.capgemini.idbibankapp.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

	private TransactionDao transactionDao;
	
	public TransactionServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		transactionDao = new TransactionDaoImpl();
	}

	@Override
	public ArrayList<Transaction> getTransactions(long accountId) {
		
		return transactionDao.geTransactions(accountId);
		
	}

}
