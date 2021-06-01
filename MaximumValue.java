package com.maxValue;

public class MaximumValue{
	
	public Integer getMaxValue(Integer a,Integer b, Integer c) {
		
		Integer maximum = a;
		if(b.compareTo(maximum)>0) {
			maximum = b;
		}
		if(c.compareTo(maximum)>0) {
			maximum = c;
		}
		return maximum;
		
	}

}
