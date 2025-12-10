package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductService;

@CrossOrigin("*")
@RestController
public class productController 
	{
		@Autowired
		ProductService psi;
		
		@PostMapping("/products")
		public void saveProduct(@RequestBody Product p)
		{
			psi.saveProduct(p);
		}
		
		@GetMapping("/products")
		public List<Product> getProducts()
		{
			return psi.getProducts();
		}
		
		@GetMapping("/products/{id}")
		public Product getProductById(@PathVariable ("id")int id)
		{
			return psi.getProductById(id);
		}
		
		@DeleteMapping("/products/{id}")
	    public void deleteProduct(@PathVariable("id") int id) {
	        psi.deleteProduct(id);
	    }
		
		@PutMapping("/products/{id}")
		public void updateProduct(@PathVariable("id")int id,@RequestBody Product p)
		{
			psi.updateProduct(id,p);
		}
	}
