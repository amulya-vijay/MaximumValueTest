package com.maxValue;

public class MaximumValue<R extends Comparable<R>>{
	
	 R a;
	 R b;
	 R c;

	public MaximumValue(R a,R b,R c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Generic method takes all three types
	public R getMaxValue() {
		
		R maximum = a;
		if(b.compareTo(maximum)>0) {
			maximum = b;
		}
		if(c.compareTo(maximum)>0) {
			maximum = c;
		}
		printMax(a,b,c,maximum);
		return maximum;		
		
	}
	
	public void printMax(R x,R y,R z,R max) {
		
		System.out.println("Maximum value in ["+a+","+b+","+c+"] : "+max);
	}

/*public Float getMaxFloat(Float f1,Float f2, Float f3) {
		
		Float maximum = f1;
		if(f2.compareTo(maximum)>0) {
			maximum = f2;
		}
		if(f3.compareTo(maximum)>0) {
			maximum = f3;
		}
		return maximum;		
	}

public static <data> data getMaxString(data s1,data s2, data s3) {
	
	data maximum = s1;
	if(s2.compareTo(maximum)>0) {
		maximum = s2;
	}
	if(s3.compareTo(maximum)>0) {
		maximum = s3;
	}
	return maximum;		
}*/

}
