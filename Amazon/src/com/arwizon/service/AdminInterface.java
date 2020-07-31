package com.arwizon.service;

import java.util.List;
import java.util.Set;

import com.arwizon.model.Product;

public interface AdminInterface {
	
	public Product addProduct(String name,String description,int price,String manufacturerName,int discount,String imgUrl,int noOfUnits,String category);	
	public Set<Product> searchProduct(String name,Set<Product> p);
	public Set<Product> delete(int productId,Set<Product> p);
	public void update(int productId,int noOfUnits,Set<Product> p);
	public boolean search(int productId,Set<Product> p);
	
} 
