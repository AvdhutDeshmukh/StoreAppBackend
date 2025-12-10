package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductService 
	{

	public void saveProduct(Product p);

	public List<Product> getProducts();

	public Product getProductById(int id);

	public void deleteProduct(int id);

	public void updateProduct(int id, Product p);
	
	

	
	
		
	}

