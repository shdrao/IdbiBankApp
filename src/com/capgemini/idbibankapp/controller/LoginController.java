package com.capgemini.idbibankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.idbibankapp.dao.CustomerDao;
import com.capgemini.idbibankapp.dao.impl.CustomerDaoImpl;
import com.capgemini.idbibankapp.dummy.DummyDatabase;
import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;
import com.capgemini.idbibankapp.service.impl.CustomerServiceImpl;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private CustomerService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		service = new CustomerServiceImpl();
		context = config.getServletContext();
	}

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String custId = request.getParameter("custId");
		String password = request.getParameter("password");
		
		Customer customer = new Customer(Long.parseLong(custId), null, password, null, null, LocalDate.now(), null);
	

		if (service.authenticate(customer).getEmail() != null) {
			HttpSession session = request.getSession();
			session.setAttribute("customer", service.authenticate(customer));
			context.log(service.authenticate(customer).toString());
			response.sendRedirect("account.do");
		} else {
			request.setAttribute("success", false);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}


	}

}
