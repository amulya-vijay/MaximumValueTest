package com.maxValue;

public class MaximumValue{
	
	public Integer getMaxInteger(Integer a,Integer b, Integer c) {
		
		Integer maximum = a;
		if(b.compareTo(maximum)>0) {
			maximum = b;
		}
		if(c.compareTo(maximum)>0) {
			maximum = c;
		}
		return maximum;		
	}
	
public Float getMaxFloat(Float f1,Float f2, Float f3) {
		
		Float maximum = f1;
		if(f2.compareTo(maximum)>0) {
			maximum = f2;
		}
		if(f3.compareTo(maximum)>0) {
			maximum = f3;
		}
		return maximum;		
	}

public String getMaxString(String s1,String s2, String s3) {
	
	String maximum = s1;
	if(s2.compareTo(maximum)>0) {
		maximum = s2;
	}
	if(s3.compareTo(maximum)>0) {
		maximum = s3;
	}
	return maximum;		
}

}
