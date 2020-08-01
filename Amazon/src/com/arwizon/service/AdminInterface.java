package com.arwizon.service;

import java.util.List;
import java.util.Set;

import com.arwizon.model.Product;

public interface AdminInterface {

	public void addProduct(String name,String description,int price,String manufacturerName,int discount,String imgUrl,int noOfUnits,String category);	
	public Set<Product> searchProduct(String name);
	public void deleteProduct(int productId);
	public void updateProduct(int productId,int noOfUnits);
	public Set<Product> DisplayAllProducts();
	
	
} 
