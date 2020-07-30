package com.arwizon.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.arwizon.model.Product;

public class AdminInterfaceImpl implements AdminInterface{

	@Override
	public Product addProduct(String name, String description, int price, String manufacturerName, int discount,
			String imgUrl, int noOfUnits, String category) {
		Product p = new Product();
		p.setName(name);
		p.setDescription(description);
		p.setPrice(price);
		p.setManufacturerName(manufacturerName);
		p.setDiscount(discount);
		p.setImgUrl(imgUrl);
		p.setNoOfUnits(noOfUnits);
		p.setCategory(category);
		p.setProductId(Product.getCount());
		return p;
	}

//	@Override
//	public Product[] search(String name,Product[] arr) {
//		Product[] arr1 = new Product[arr.length];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(name.equals(arr[i].getName())) {
//				arr1[j]=arr[i];
//				j++;
//			}
//		}
// 		return arr1;
//	}

	@Override
	public Set<Product> searchProduct(String name, Set<Product> p) {
		Set<Product> p1= new HashSet();
		for(Product pro:p) {
			if(pro.getName().equals(name)) {
				p1.add(pro);	}
		}
		return p1;
		
	}

	@Override
	public Set<Product> delete(int productId, Set<Product> p) {
		
		for(Product pr:p) {
			if(pr.getProductId()==productId) {
				p.remove(pr);
				break;
			}
		}
		
		return p;
	}

	@Override
	public void update(int productId, int noOfUnits, Set<Product> p) {
		for(Product pro:p) {
			if(pro.getProductId()==productId) {
				pro.setNoOfUnits(noOfUnits);
				break;
			}
		}
		
	}

	@Override
	public boolean search(int productId, Set<Product> p) {
		for(Product pro:p) {
			if(pro.getProductId()==productId)
				return true;
		}
		return false;
	}

}
