package com.capgemini.idbibankapp.dummy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.idbibankapp.model.BankAccount;
import com.capgemini.idbibankapp.model.Customer;

public class DummyDatabase {
	private static Set<Customer> customers = new HashSet<>();
	private static Set<BankAccount> bankAccounts = new HashSet<>();

	public DummyDatabase() {
		super();
		// TODO: Write dummy data
		BankAccount account1 = new BankAccount("SAVINGS", 100);
		BankAccount account2 = new BankAccount("SAVINGS", 100);
		BankAccount account3 = new BankAccount("SAVINGS", 100);
		
		bankAccounts.add(account1);
		bankAccounts.add(account2);
		bankAccounts.add(account3);

		customers.add(new Customer(13564,"John", "ashkdas", "asdhjkas@gmail.com", "Airoli", LocalDate.now(), account1));
		customers.add(new Customer(12345,"John", "ashkdas", "asdhGDFjkas@gmail.com", "Airoli", LocalDate.now(), account2));
		customers.add(new Customer(15897,"John", "ashkdas", "asBCVBCdhjkas@gmail.com", "Airoli", LocalDate.now(), account3));
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
