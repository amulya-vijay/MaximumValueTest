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
	Float val1;
	Float val2;
	Float val3;
	
	MaximumValue mv;
	@Before
	public void initialize() {
		mv = new MaximumValue();
	}
	public MaximumValueTest(Integer i1, Integer i2,Integer i3, Float f1, Float f2, Float f3) {
		this.firstValue = i1;
		this.secondValue = i2;
		this.thirdValue = i3;
		this.val1 = f1;
		this.val2 = f2;
		this.val3 = f3;
		
	}
	
	@Parameterized.Parameters
public static Collection imputValues() {
		
		return  Arrays.asList(new Object[][] {{158,56,98,1.2f,1.1f,0.9f},{45,999,12,1.2f,10.0f,1.5f},{1,2,4,1.5f,1.2f,100.0f}});
	}

	@Test
	public void Integertest1() {
		
		Integer maxValue = mv.getMaxInteger(firstValue,secondValue,thirdValue);
		Assert.assertEquals(firstValue, maxValue);
		System.out.println("first integer test: "+maxValue);
	}
	
	@Test
	public void Integertest2() {
		
		Integer maxValue = mv.getMaxInteger(firstValue,secondValue,thirdValue);
		Assert.assertEquals(secondValue, maxValue);
		System.out.println("secoond integer test: "+maxValue);
	}
	
	@Test
	public void Integertest3() {
		Integer maxValue = mv.getMaxInteger(firstValue,secondValue,thirdValue);
		Assert.assertEquals(thirdValue, maxValue);
		System.out.println("third integer test: "+maxValue);
	}
	
	@Test
	public void Floattest1() {
		
		Float maxValue = mv.getMaxFloat(val1,val2,val3);
		Assert.assertEquals(val1, maxValue);
		System.out.println("first float test: "+maxValue);
	}
	
	@Test
	public void Floattest2() {
		
		Float maxValue = mv.getMaxFloat(val1,val2,val3);
		Assert.assertEquals(val2, maxValue);
		System.out.println("Second float test: "+maxValue);
	}
	
	@Test
	public void Floattest3() {
		
		Float maxValue = mv.getMaxFloat(val1,val2,val3);
		Assert.assertEquals(val3, maxValue);
		System.out.println("Third float test: "+maxValue);
	}
	

}
