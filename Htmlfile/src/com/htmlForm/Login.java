package com.htmlForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String email=req.getParameter("email1");
		String pass=req.getParameter("pass1");
		
		if(email.equals("akeshari116@gmail.com")&& pass.equals("1234"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("profile.html");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd1=req.getRequestDispatcher("error.html");
			rd1.include(req, resp);
			
			RequestDispatcher rd2=req.getRequestDispatcher("login.html");
			rd2.include(req, resp);
		}
	}
}
