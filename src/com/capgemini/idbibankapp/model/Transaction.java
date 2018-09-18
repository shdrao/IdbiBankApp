package com.capgemini.idbibankapp.model;

import java.time.LocalDate;

public class Transaction {
	private long transactionId;
	private long accountId;
	private String narrator;
	private double credit;
	private double debit;
	private LocalDate transDate;
	private double balance;
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction(long transactionId, long accountId, String narrator, double credit, double debit,
			LocalDate transDate, double balance) {
		super();
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.narrator = narrator;
		this.credit = credit;
		this.debit = debit;
		this.transDate = transDate;
		this.balance = balance;
	}


	public long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}


	public long getAccountId() {
		return accountId;
	}


	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}


	public String getNarrator() {
		return narrator;
	}


	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}


	public double getCredit() {
		return credit;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public double getDebit() {
		return debit;
	}


	public void setDebit(double debit) {
		this.debit = debit;
	}


	public LocalDate getTransDate() {
		return transDate;
	}


	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountId=" + accountId + ", narrator=" + narrator
				+ ", credit=" + credit + ", debit=" + debit + ", transDate=" + transDate + "]";
	}
	
	
	
	
}
