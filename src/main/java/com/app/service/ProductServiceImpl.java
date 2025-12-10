package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
	{

		@Autowired
		ProductRepository pr;
	@Override
	public void saveProduct(Product p) 
	{
		pr.save(p);
	}
	@Override
	public List<Product> getProducts() 
	{
		return pr.findAll();
		
	}
	@Override
	public Product getProductById(int id) 
	{
		
		return pr.findById(id).get();
	}
	@Override
	public void deleteProduct(int id)
	{
		pr.deleteById(id);
		
	}
	@Override
	public void updateProduct(int id, Product p) 
	{
		Optional<Product> prod= pr.findById(id);
		
		if(prod.isPresent())
		{
			Product product=prod.get();
			
			product.setProductName(p.getProductName());
			product.setQuantity(p.getQuantity());
			product.setCategory(p.getCategory());
			product.setDescription(p.getDescription());
			product.setPrice(p.getPrice());
			product.setSupplier(p.getSupplier());
			pr.save(product);
		}
	}
	
		
	}
