package com.capgemini.idbibankapp.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editprofile")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

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

protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		
	}

}
