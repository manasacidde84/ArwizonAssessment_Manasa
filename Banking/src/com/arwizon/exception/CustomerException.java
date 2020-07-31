package com.arwizon.exception;

public class CustomerException extends Exception{
	String detailMsg;
	
	public CustomerException(String msg) {
		this.detailMsg=msg;
	}
	@Override
	public String getMessage() {
		return detailMsg;
	}
	

}
