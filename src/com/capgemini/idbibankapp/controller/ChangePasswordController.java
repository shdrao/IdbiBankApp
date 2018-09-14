package com.capgemini.idbibankapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;
import com.capgemini.idbibankapp.service.impl.CustomerServiceImpl;

@WebServlet("/changePassword.do")
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private CustomerService service;

	public ChangePasswordController() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		service = new CustomerServiceImpl();
		context = config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		HttpSession session = request.getSession();
		//
		request.setAttribute("success", false);
		Customer customer = (Customer) session.getAttribute("customer");
		if (confirmPassword.equals(newPassword)) {
			service.updatePassword(customer, oldPassword, newPassword);
			request.setAttribute("success", true);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
	}

}