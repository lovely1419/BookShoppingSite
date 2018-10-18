package com.Tree.model;

import java.io.Serializable;
import java.util.UUID;

public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String categoryId;
	private String categoryName;
	private String categoryDescription;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = UUID.randomUUID().toString().substring(0,5);
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}
