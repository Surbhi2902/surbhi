package com.surbhinegi.Dao;

import java.util.List;

import com.surbhinegi.model.Category;


public interface CategoryDao {


	public boolean add(Category category);
	public boolean delete(Category category);
	public boolean update(Category category);
	public List<Category> listCategory();
	public Category getCategory(int categoryId);
}
