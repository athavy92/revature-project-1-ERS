package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	
	public void main(String[] args) {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail = req.getParameter("userEmail");
		String userPassword = req.getParameter("userPassword");
		
		String session = (String) req.getAttribute(userEmail);
		
		//resp.setStatus(HttpServletResponse.SC_OK);
		
		resp.getWriter().write("Signed in");
		
		System.out.println("Received from Login Page: " + userEmail + " and " + userPassword);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String userEmail = req.getParameter("userEmail");
		String userPassword = req.getParameter("userPassword");
		
		System.out.println("Received from Login Page: " + userEmail + " and " + userPassword);

	
		
		HttpSession userSession = req.getSession();	
		String verifiedUser = req.getParameter("userEmail");
		userSession.setAttribute("userEmail", verifiedUser);
		String session = (String) req.getAttribute(userEmail);

		//resp.setStatus(HttpServletResponse.SC_OK);
		
		resp.getWriter().write("Signed in");
		
	}
}
