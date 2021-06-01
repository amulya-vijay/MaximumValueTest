package com.maxValue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumValueTest {
	
	MaximumValue mv = new MaximumValue();

	@Test
	public void test1() {
		
		Integer maxValue = mv.getMaxValue(156, 85, 100);
		System.out.println(maxValue);
	}

}
