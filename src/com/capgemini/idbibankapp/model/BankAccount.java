package com.capgemini.idbibankapp.model;

import java.time.LocalDate;
import java.util.Random;

public class BankAccount {
	private long accountId;
	private String accountType;
	private double balance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accountType, double balance) {
		super();
		Random rand = new Random();
		this.accountId = 70000000 + rand.nextInt(500000);
		this.accountType = accountType;
		this.balance = balance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	
}