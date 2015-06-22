package com.code4t2;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestHello {

	String x="";
	protected static final Logger LOGGER = LoggerFactory.getLogger(TestHello.class);
	
	@Before
	public void init(){
		x="Sachin";
	}
	
	@Test
	//@Ignore
	public void test1(){
		
		Hello.sayHello(x);
		LOGGER.debug("HAHAHAHA");
		LOGGER.info("FYI!");
		LOGGER.warn("This is the end of the world");
	}
	
}
