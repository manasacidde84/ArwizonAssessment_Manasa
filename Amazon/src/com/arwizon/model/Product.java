package com.arwizon.model;

public class Product implements Comparable<Product> {
	
	private int productId;
	private String name;
	private String description;
	private int price;
	private String manufacturerName;
	private int discount;
	private String imgUrl;
	private int noOfUnits;
	private String category;
	


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", manufacturerName=" + manufacturerName + ", discount=" + discount + ", imgUrl=" + imgUrl
				+ ", noOfUnits=" + noOfUnits + ", category=" + category + "]";
	}
	

	
	@Override
	public int compareTo(Product p) {
		if(this.getName().compareTo(p.getName())>0)
			return 1;
		else if(this.getName().compareTo(p.getName())<0)
			return -1;
		else
		return 0;
	}

	

}
