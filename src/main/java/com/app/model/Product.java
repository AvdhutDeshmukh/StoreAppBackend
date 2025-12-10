package com.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String productName;
		private String description;
		private String category;
		private double price;
		private String supplier;
		private String quantity;
		private boolean inStock;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getSupplier() {
			return supplier;
		}
		public void setSupplier(String supplier) {
			this.supplier = supplier;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public boolean isInStock() {
			return inStock;
		}
		public void setInStock(boolean inStock) {
			this.inStock = inStock;
		}
		
		
		
	}
