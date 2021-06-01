package com.maxValue;

public class MaximumValue {
	
	public Integer getMaxValue(Integer a,Integer b, Integer c) {
		
		Integer maximum = a;
		if(b.compareTo(maximum)>0) {
			maximum = b;
		}
		if(c.compareTo(maximum)>0) {
			maximum = c;
		}
		return maximum;
	/*	if(a.compareTo(b)>0 && a.compareTo(c)>0) {
			return a;
		}
		if(b.compareTo(a)>0 && b.compareTo(c)>0) {
			return b;
		}else {
			return c;
		} */
		
	}

}
