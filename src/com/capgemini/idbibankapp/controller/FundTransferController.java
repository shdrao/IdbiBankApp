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
import com.capgemini.idbibankapp.service.BankAccountService;
import com.capgemini.idbibankapp.service.CustomerService;
import com.capgemini.idbibankapp.service.impl.CustomerServiceImpl;

@WebServlet("/fundtransfer")
public class FundTransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private CustomerService service = new CustomerServiceImpl();
	BankAccountService bankAccountService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		DummyDatabase db = new DummyDatabase();
		context = config.getServletContext();
	}

	public FundTransferController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		
		//request.getParameter("narrator");
		session.getAttribute(name)
		if(bankAccountService.fundTransfer(Long.parseLong(()),Long.parseLong(request.getParameter("toAccount")), 
				Double.parseDouble(request.getParameter("amount")))) {
		
			
			PrintWriter out = response.getWriter();
		out.println("sucess");}
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("accountDetails.jsp");
//		dispatcher.forward(request, response);
		
		
		
	}

}
