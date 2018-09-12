package com.capgemini.idbibankapp.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.idbibankapp.model.Customer;
import com.capgemini.idbibankapp.service.CustomerService;
import com.capgemini.idbibankapp.service.impl.CustomerServiceImpl;

@WebServlet("/editprofile")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private CustomerService service = new CustomerServiceImpl();

	public EditProfileController() {
		super();
	}
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init();
	context = config.getServletContext();
}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	super.doGet(req, resp);
	
}


		

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long customerId = Long.parseLong(request.getParameter("custId"));
		String customerName = request.getParameter("custName");
		String email = request.getParameter("custEmail");
		String dateOfBirth = request.getParameter("custDOB");
		String address = request.getParameter("custAddress");

		HttpSession session = request.getSession();

		Customer customer = new Customer(customerId, customerName, null, email, address, LocalDate.parse(dateOfBirth),
				null);
//		System.out.println(service.updateProfile(customer));
		session.setAttribute("customer", service.updateProfile(customer));
		RequestDispatcher dispatcher = request.getRequestDispatcher("editCustomer.jsp");
		dispatcher.forward(request, response);

	}

}
