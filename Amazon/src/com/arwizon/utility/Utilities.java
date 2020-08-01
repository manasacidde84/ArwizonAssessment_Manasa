package com.arwizon.utility;

import com.arwizon.exception.ProductException;

public class Utilities {
	
	public static void validateChar(String name) throws ProductException {
		if(!name.matches("[A-Za-z]+"))
			throw new ProductException("This field accepts only characters");
	}
	
	public static void validatePrice(String price) throws ProductException {
		String Pattern = "[1-9]+";
		if(! price.matches(Pattern)) {
			throw new ProductException("Price can only be greater than zero");	
		}
	}
	
	
	public static void validatediscount(String discount) throws ProductException {
		String Pattern = "[0-9]{2}";
		if(!discount.matches(Pattern)) {
			throw new ProductException("Enter valid discount");	
		}
	}
	public static void validateUrl(String imgurl)throws ProductException {
		String Pattern = "(https){1}[a-zA-Z]{2,}[.]+[a-zA-z]{1,}(.com){1}";
		if(!imgurl.matches(Pattern)) {
			throw new ProductException("Url not valid");	
		}
	}
	public static void validateUnits(String noOfUnits) throws ProductException {
		String Pattern = "[0-9]+";
		if(!noOfUnits.matches(Pattern)) {
			throw new ProductException("This field accepts only numerical values");	
		}
	}
	

}
