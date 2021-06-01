package com.maxValue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MaximumValueTest {
	
	Integer firstValue;
	Integer secondValue;
	Integer thirdValue;
	MaximumValue mv;
	@Before
	public void initialize() {
		mv = new MaximumValue();
	}
	public MaximumValueTest(Integer a, Integer b,Integer c) {
		this.firstValue = a;
		this.secondValue = b;
		this.thirdValue = c;
	}
	
	@Parameterized.Parameters
public static Collection imputValues() {
		
		return  Arrays.asList(new Object[][] {{158,56,98},{45,999,12},{1,2,4}});
	}

	@Test
	public void Integertest1() {
		
		Integer maxValue = mv.getMaxValue(firstValue,secondValue,thirdValue);
		Assert.assertEquals(firstValue, maxValue);
		System.out.println("first test: "+maxValue);
	}
	
	@Test
	public void Integertest2() {
		
		Integer maxValue = mv.getMaxValue(firstValue,secondValue,thirdValue);
		Assert.assertEquals(secondValue, maxValue);
		System.out.println("secoond test: "+maxValue);
	}
	
	@Test
	public void Integertest3() {
		Integer maxValue = mv.getMaxValue(firstValue,secondValue,thirdValue);
		Assert.assertEquals(thirdValue, maxValue);
		System.out.println("third test: "+maxValue);
	}

}
