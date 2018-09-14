package com.capgemini.idbibankapp.dao.impl;

import java.util.Set;

import com.capgemini.idbibankapp.dao.BankAccountDao;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {
	private Set<BankAccount> bankAccounts;

	public BankAccountDaoImpl() {
		super();
		bankAccounts = DummyDatabase.getBankAccounts();
	}

	@Override
	public double getBalance(long accountId) {
		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountId() == accountId) {
				return bankAccount.getBalance();
			}
		}
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {

		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountId() == accountId) {
				bankAccount.setBalance(newBalance);
//				DummyDatabase.setBankAccounts(bankAccounts);
				return bankAccount.getBalance();
			}
		}
		return 0;

	}

}
