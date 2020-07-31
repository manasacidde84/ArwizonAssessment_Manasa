package com.arwizon.utility;

import com.arwizon.exception.CustomerException;

public class Utilities {
	public static void validateChar(String name) throws CustomerException {
		if(!name.matches("[A-Za-z]+"))
			throw new CustomerException("This field accepts only characters");
	}

}
