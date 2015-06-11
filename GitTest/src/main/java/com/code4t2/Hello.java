package com.code4t2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spi.Abcd;

public class Hello {

	protected static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);
	
	public static void sayHello(String x) {

		if(x !=null && !x.trim().isEmpty())
			System.out.println("Hi "+ x);
		else
			System.out.println("Hi Titu");
		
		Abcd abc = new Abcd();
		abc.setX("sdvgsdvytdsvyfsdt");
		LOGGER.info(abc.getX());
		
	}
	
	

}
