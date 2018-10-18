package com.Tree.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tree.dao.CustomerBook;
import com.Tree.database.ConnectionProvider;
import com.Tree.implementation.CustomerBookImpl;
import com.Tree.model.Customer;


public class SignupServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	RequestDispatcher rd;


    public SignupServlet() {
      super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try
		{
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		Long contact=Long.parseLong(request.getParameter("contact"));
        String gender=request.getParameter("gender");
        Customer customer=new Customer();
        customer.setCustomerName(name);
        customer.setCustomerPassword(password);
        customer.setCustomerEmail(email);
        customer.setCustomerContact(contact);
        customer.setCustomerGender(gender);
        CustomerBook dao=new CustomerBookImpl();
         if(dao.addCustomer(customer))
         {
        	 rd=request.getRequestDispatcher("/Login.jsp");
        	 rd.forward(request,response);
         }
         else
         {
        	 rd=request.getRequestDispatcher("/register.jsp");
        	 rd.include(request,response);
         }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
