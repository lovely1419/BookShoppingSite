package com.Tree.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tree.dao.CategoryBook;
import com.Tree.database.ConnectionProvider;
import com.Tree.implementation.CategoryBookImpl;
import com.Tree.model.Category;

/**
 * Servlet implementation class AddCategoryServlet
 */
@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	RequestDispatcher rd;
       
    public AddCategoryServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			con=ConnectionProvider.getConnection();
			PrintWriter out=response.getWriter();
			String name=request.getParameter("name");
			String description=request.getParameter("description");
			Category category=new Category();
			category.setCategoryName(name);
			category.setCategoryDescription(description);
			CategoryBook dao=new CategoryBookImpl();
			if(dao.addCategory(category))
			{
				rd=request.getRequestDispatcher("/admin.jsp");   //check name of admin.jsp
				rd.forward(request, response);
				
			}
			else
			{
				rd=request.getRequestDispatcher("/addcategory.jsp");  //check addcategory.jsp
				rd.forward(request, response);
			}
		}
		
		
		catch(Exception e)
		{
			System.out.println("Exception occour from AddCategoryServlet");
		}
		
		
	}

}
