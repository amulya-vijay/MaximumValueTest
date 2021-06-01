package com.maxValue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
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
	String string1;
	String string2;
	String string3;
	
	
	public MaximumValueTest(Integer i1, Integer i2,Integer i3, Float f1, Float f2, Float f3,String s1,String s2,String s3) {
	
		this.firstValue = i1;
		this.secondValue = i2;
		this.thirdValue = i3;
		this.val1 = f1;
		this.val2 = f2;
		this.val3 = f3;
		this.string1 = s1;
		this.string2 = s2;
		this.string3 = s3;
		
	}
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
public static Collection imputValues() {
		
		return  Arrays.asList(new Object[][] {{158,56,98,1.2f,1.1f,0.9f,"peach","apple","kiwi"}
											,{45,999,12,1.2f,10.0f,1.5f,"apple","strawberry","plum"}
											,{1,2,4,1.5f,1.2f,100.0f,"banana","melon","pineapple"}});
	}

	@Test
	public void Integertest1() {
		Assert.assertEquals(firstValue,new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue() );
	//  System.out.println(new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue());
	}
	
	@Test
	public void Integertest2() {
			Assert.assertEquals(secondValue,new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue() );
		//	System.out.println(new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue());
	
	}
	
	@Test
	public void Integertest3() {
			Assert.assertEquals(thirdValue,new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue() );
		//	System.out.println(new MaximumValue<Integer>(firstValue,secondValue,thirdValue).getMaxValue());
	}
	
	@Test
	public void Floattest1() {
			Assert.assertEquals(val1,new MaximumValue<Float>(val1,val2,val3).getMaxValue() );
		//	System.out.println(new MaximumValue<Float>(val1,val2,val3).getMaxValue());
	
	}

	@Test
	public void Floattest2() {
		
			Assert.assertEquals(val2,new MaximumValue<Float>(val1,val2,val3).getMaxValue() );
		//	System.out.println(new MaximumValue<Float>(val1,val2,val3).getMaxValue());
	
	}
	
	@Test
	public void Floattest3() {
		Assert.assertEquals(val3,new MaximumValue<Float>(val1,val2,val3).getMaxValue() );
	//	System.out.println(new MaximumValue<Float>(val1,val2,val3).getMaxValue());
	
	}
	
	@Test
	public void StringTest1() {
		Assert.assertEquals(string1,new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	//	System.out.println(new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	
	}
	
	@Test
	public void StringTest2() {
		Assert.assertEquals(string2,new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	//	System.out.println(new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	
	}
	
	@Test
	public void StringTest3() {
		Assert.assertEquals(string3,new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	//	System.out.println(new MaximumValue<String>(string1,string2,string3).getMaxValue() );
	
	}
}
