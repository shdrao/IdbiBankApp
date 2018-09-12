package com.capgemini.idbibankapp.service.impl;

import com.capgemini.idbibankapp.dao.BankAccountDao;
import com.capgemini.idbibankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountDao bankAccountDao;

	public BankAccountServiceImpl() {
		super();
		bankAccountDao = new BankAccountDaoImpl();
	}

	@Override
	public double getBalance(long accountId) {
		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) {
		if (bankAccountDao.getBalance(accountId) >= amount) {
			return bankAccountDao.updateBalance(accountId, bankAccountDao.getBalance(accountId) - amount);
		}
		return -1;
	}

	@Override
	public double deposit(long accountId, double amount) {
		return bankAccountDao.updateBalance(accountId, bankAccountDao.getBalance(accountId) + amount);
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
		if (withdraw(fromAcc, amount) != -1) {
			System.out.println(this.deposit(toAcc, amount));
			return true;
		}
		return false;

	}
}
