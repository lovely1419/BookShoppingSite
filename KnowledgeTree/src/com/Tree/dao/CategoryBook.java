package com.Tree.dao;

import java.util.List;

import com.Tree.model.Category;

public interface CategoryBook {
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
	List<CategoryBook> getAllCategory();
	
	
	
}
