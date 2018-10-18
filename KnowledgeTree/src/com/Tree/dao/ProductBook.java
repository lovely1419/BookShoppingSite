package com.Tree.dao;

import java.util.List;

import com.Tree.model.Product;

public interface ProductBook {
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
	List<Product> getProduct();
	Product getAllProductByProductId(String productId);
	Product getAllProductByProductCategory(String productCategory);

}
