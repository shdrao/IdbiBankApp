package com.capgemini.idbibankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.model.Transaction;
import com.capgemini.idbibankapp.service.TransactionService;
import com.capgemini.idbibankapp.service.impl.TransactionServiceImpl;


@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionService transService;
	
    public AccountController() {
        super();
        // TODO Auto-generated constructor stub
        transService = new TransactionServiceImpl();
    }
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		ArrayList<Transaction> trans = transService.getTransactions(customer.getAccount().getAccountId());
		session.setAttribute("transactions", trans);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("accountDetails.jsp");
		dispatcher.forward(request, response);
	}

}
