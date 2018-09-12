package com.capgemini.idbibankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.BankAccountService;
import com.capgemini.idbibankapp.service.CustomerService;
import com.capgemini.idbibankapp.service.impl.BankAccountServiceImpl;
import com.capgemini.idbibankapp.service.impl.CustomerServiceImpl;

@WebServlet("/fundtransfer")
public class FundTransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private CustomerService service;
	BankAccountService bankAccountService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		service = new CustomerServiceImpl();
		bankAccountService = new BankAccountServiceImpl();
		context = config.getServletContext();
	}

	public FundTransferController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		long toAccount = Long.parseLong(request.getParameter("toAccount"));
		long amount = Long.parseLong(request.getParameter("amount"));

		// request.getParameter("narrator");
		Customer customer = (Customer) session.getAttribute("customer");
		// System.out.println("djfs"+customer);
		/*
		 bankAccountService.fundTransfer(customer.getCustomerId(), Long.parseLong(request.getParameter("toAccount")),
				Double.parseDouble(request.getParameter("amount")))
		 */
		
		if (bankAccountService.fundTransfer(customer.getAccount().getAccountId(), toAccount, amount)) {
			PrintWriter out = response.getWriter();
			out.println(bankAccountService.getBalance(customer.getAccount().getAccountId()));
			out.println(bankAccountService.getBalance(toAccount));
		}
	

	}

//		RequestDispatcher dispatcher = request.getRequestDispatcher("accountDetails.jsp");
//		dispatcher.forward(request, response);

}
