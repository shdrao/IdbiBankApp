package com.capgemini.idbibankapp.dummy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.idbibankapp.model.BankAccount;
import com.capgemini.idbibankapp.model.Customer;

public class DummyDatabase {
	private static Set<Customer> customers = new HashSet<>();
	private static Set<BankAccount> bankAccounts = new HashSet<>();

	static {
		BankAccount account1 = new BankAccount(221701, "SAVINGS", 120);
		BankAccount account2 = new BankAccount(221700, "SAVINGS", 100);
		BankAccount account3 = new BankAccount(221702, "SAVINGS", 100);

		bankAccounts.add(account1);
		bankAccounts.add(account2);
		bankAccounts.add(account3);

		customers
				.add(new Customer(123456, "Sharath D Rao", "34", "sharathdrao@gmail.com", "CKP, Mumbai, Airoli", LocalDate.of(1996, 03, 21), account1));
		customers.add(new Customer(12345, "Sudarshan K Shanbhag", "12", "sudarshanshanbhag@gmail.com", "CKP, Mumbai, Airoli", LocalDate.of(1996, 05, 30), account2));
		customers.add(
				new Customer(15768, "Harini k", "98", "harinik@gmail.com", "CKP, Mumbai, Airoli", LocalDate.of(1996, 03, 21), account3));

	}

	public DummyDatabase() {
		super();
		// TODO: Write dummy data
	}

	public static Set<Customer> getCustomers() {
		return customers;
	}

	public static Set<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public static void setCustomers(Set<Customer> customers) {
		DummyDatabase.customers = customers;
	}

	public static void setBankAccounts(Set<BankAccount> bankAccounts) {
		DummyDatabase.bankAccounts = bankAccounts;
	}

}
