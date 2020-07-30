package com.arwizon.exception;

public class ProductException extends Exception{
	String detailMsg;
	
	public ProductException(String msg) {
		this.detailMsg=msg;
	}
	@Override
	public String getMessage() {
		return detailMsg;
	}
	

}
