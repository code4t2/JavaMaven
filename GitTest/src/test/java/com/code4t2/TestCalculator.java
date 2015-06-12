package com.code4t2;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import com.code4t2.Calculator;

public final class TestCalculator {
	
	@Test(expected = RuntimeException.class)
	@Ignore
	public final void whenMoreThanTwoNumbersAreUsedThenExceptionIsThrown() {
		Calculator.add("1,2,3");
	}
	
	@Test
	public final void whenTwoNumbersAreUsedThenNoExceptionIsThrown() {
		Calculator.add("1,2");
	}
	
	@Test(expected = RuntimeException.class)
	public final void whenNonNumberIsusedThenExceptionIsThrown() {
		Calculator.add("1,X");
	}
	
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIsZero() {
		Assert.assertEquals(0, Calculator.add(""));
	}
	
	@Test 
	public final void whenOneNumberIsUsedThenReturnTheValueOfTheSameNumber() {
		Assert.assertEquals(3, Calculator.add("3"));
	}
	
	@Test
	public final void whenTwoNumbersAreUsedthenReturnTheValueOftheirSum() {
		Assert.assertEquals(3+6, Calculator.add("3,6"));
	}
	
	@Test
	public final void whenAnyNumberOfNumbersAreUsedThenTheSumIsReturned() {
		Assert.assertEquals(1+2+3+4+5, Calculator.add("1,2,3,4,5"));
	}

}
