package com.code4t2;

public class Calculator {
	
	public static final int add(final String numberString) {
		
		int returnValue = 0;
		String[] numbersArray = numberString.split(",");
		
//		if(numbersArray.length > 2) {
//			throw new RuntimeException("Up to two numbers separated by commas (,) are allowed");
//		} else {
			for(String number: numbersArray) {
				//Integer.parseInt(number); //If NaN, exception will be thrown
				if (!number.trim().isEmpty()) {
					returnValue += Integer.parseInt(number);
				}
			}
			return returnValue;
//		}
		
	}

}
