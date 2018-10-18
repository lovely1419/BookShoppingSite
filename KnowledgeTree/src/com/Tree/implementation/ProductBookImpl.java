package com.Tree.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Tree.dao.ProductBook;
import com.Tree.database.ConnectionProvider;
import com.Tree.model.Product;

public class ProductBookImpl implements ProductBook {
	  private Connection con=null;

	@Override
	public boolean addProduct(Product product) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			statement.setString(1,product.getProductId());
			statement.setString(2,product.getProductName());
			statement.setString(3,product.getProductDescription());
			statement.setDouble(4,product.getProductPrice());
			statement.setBlob(5,product.getProductImage());
			statement.setString(6,product.getProductCategory());
			statement.setDouble(7,product.getProductQuantity());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println(product.getProductName()+"is Successfully added.");
				return true;
			}
		}
		catch(SQLException e)
		{
			System.out.println("something happens wrong please try again");
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		try
		{
    con=ConnectionProvider.getConnection();
	PreparedStatement statement=con.prepareStatement("update product set productName=? , productDescription=? ,  productPrice=? , productImage=? , productCategory=? , productOuantity=? where productId=?");
	statement.setString(1,product.getProductName());
	statement.setString(2,product.getProductDescription());
	statement.setDouble(3,product.getProductPrice());
	statement.setBlob(4,product.getProductImage());
	statement.setString(5,product.getProductCategory());
	statement.setDouble(6,product.getProductQuantity());
	statement.setString(7,product.getProductId());
	int result=statement.executeUpdate();
	if(result>0)
	{
		System.out.println("Product is successfully added.");
		return true;
	}
		}
		catch(SQLException ee)
		{
			System.out.println("Product could not be updated please try again");
			System.out.println(ee);
		}
		
		
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		try
		{
	con=ConnectionProvider.getConnection();
	PreparedStatement statement=con.prepareStatement("delete from product where productId=?");
	statement.setString(1,product.getProductId());
	int result=statement.executeUpdate();
	if(result>0)
	{
		System.out.println(product.getProductName()+" is Successfully deleted");
		return true;
	}
	
		}
		
		catch(SQLException es)
		{
			System.out.println("Product Could not be deleted");
			System.out.println(es);
		}
		System.out.println("Product Could not be deleted");
		
		
		return false;
	}

	@Override
	public List<Product> getProduct() {
		try
		{
			con=ConnectionProvider.getConnection();
			List<Product> list=new ArrayList<Product>();
			Statement statement=con.createStatement();
			ResultSet result=statement.executeQuery("select * from product");
			System.out.println("*#-------------Your product detail--------------#*");
			while(result.next())
			{
	  System.out.println("ProductId:-" +result.getString(1)+ "\nProductName:-" +result.getString(2)+ "\nProductDescription:-" +result.getString(3)+ "\nProductPrice:-" +result.getDouble(4)+ "\nProductImage:-" +result.getBlob(5)+ "\nProductCategory:-" +result.getString(6)+ "\nProductQuantity:-" +result.getDouble(7));
	  Product product=new Product();
	  product.setProductId(result.getString(1));
	  product.setProductName(result.getString(2));
	  product.setProductDescription(result.getString(3));
	  product.setProductPrice(result.getDouble(4));
	  product.setProductImage(result.getBlob(5));
	  product.setProductCategory(result.getString(6));
	  product.setProductQuantity(result.getDouble(7));
	  list.add(product);
			}
		}
		catch(SQLException se)
		{
			System.out.println("Could not be fetched try again.");
			System.out.println(se);
		}
		System.out.println("Could not be fetched try again.");
		
		
		return null;
	}

	@Override
	public Product getAllProductByProductId(String productId) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("select * from product where productId=?");
			statement.setString(1,productId);
			ResultSet result=statement.executeQuery();
			System.out.println("#*-----------Product Detail-----------*#");
			if(result.next())
			{
	System.out.println("ProctId:-" +result.getString(1)+ "ProductName:-" +result.getString(2)+ "ProductDescription:-" +result.getString(3)+ "ProctPrice:-" +result.getDouble(4)+ "ProctImage:-" +result.getBlob(5)+ "ProctCategory:-" +result.getString(6)+ "ProctQuantity:-" +result.getDouble(7));
	Product product=new Product();
	product.setProductId(result.getString(1));
	product.setProductName(result.getString(2));
	product.setProductDescription(result.getString(3));
	product.setProductPrice(result.getDouble(4));
	product.setProductImage(result.getBlob(5));
	product.setProductCategory(result.getString(6));
	product.setProductQuantity(result.getDouble(7));
	return product;
			}
		}
		catch(SQLException es)
		{
			System.out.println("Sorry something went wrong cannot fetched.");
			System.out.println(es);
		}
		
		System.out.println("Sorry something went wrong cannot fetched.");
		return null;
	}

	@Override
	public Product getAllProductByProductCategory(String productCategory) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement statement=con.prepareStatement("select * from product where productCategory=?");
			statement.setString(1,productCategory);
			ResultSet result=statement.executeQuery();
			if(result.next())
			{
				System.out.println("ProctId:-" +result.getString(1)+ "ProductName:-" +result.getString(2)+ "ProductDescription:-" +result.getString(3)+ "ProctPrice:-" +result.getDouble(4)+ "ProctImage:-" +result.getBlob(5)+ "ProctCategory:-" +result.getString(6)+ "ProctQuantity:-" +result.getDouble(7));
				Product product=new Product();
				product.setProductId(result.getString(1));
				product.setProductName(result.getString(2));
				product.setProductDescription(result.getString(3));
				product.setProductPrice(result.getDouble(4));
				product.setProductImage(result.getBlob(5));
				product.setProductCategory(result.getString(6));
				product.setProductQuantity(result.getDouble(7));
				return product;			
			}
		}catch(SQLException se)
		{
			System.out.println("Not in the list.");
			System.out.println(se);
		}
		System.out.println("Not in the list.");
		
		
		
		
		return null;
	}

}
