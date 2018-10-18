package com.Tree.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Tree.dao.CustomerBook;
import com.Tree.database.ConnectionProvider;
import com.Tree.implementation.CustomerBookImpl;
import com.Tree.model.Customer;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Connection con=null;   
	RequestDispatcher rd;


    public LoginServlet() {
       super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
		try
		{
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	    CustomerBook dao=new CustomerBookImpl();
	    if(email.equals("admin@gmail.com") && password.equals("admin"))
	    {
	    	rd=request.getRequestDispatcher("/admin.jsp");
			rd.forward(request,response);
	    }
	    if(dao.validate(email ,password))
	    {
	    	rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request,response);
	    }
		else
		{
			rd=request.getRequestDispatcher("/Login.jsp");
			rd.include(request,response);
		}
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
