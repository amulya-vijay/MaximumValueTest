package com.maxValue;

import org.junit.Test;

public class MaximumValueTest {
	
	MaximumValue mv = new MaximumValue();

	@Test
	public void Integertest1() {
		
		Integer maxValue = mv.getMaxValue(156, 85, 100);
		System.out.println(maxValue);
	}
	
	@Test
	public void Integertest2() {
		
		Integer maxValue = mv.getMaxValue(156, 885, 100);
		System.out.println(maxValue);
	}

}
