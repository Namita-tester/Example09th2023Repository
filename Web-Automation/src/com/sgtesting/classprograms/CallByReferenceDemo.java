package com.sgtesting.classprograms;

public class CallByReferenceDemo 
{
	int x,y;
	void calculate(CallByReferenceDemo obj)
	{
		obj.x=100;
		obj.y=2000;
		System.out.println("In calculate method x value:"+obj.x);
		System.out.println("In main calculate y value:"+obj.y);
	}

	public static void main(String[] args) 
	{
		CallByReferenceDemo obj=new CallByReferenceDemo();
		obj.x=10;
		obj.y=20;
		System.out.println("In main method x value:"+obj.x);
		System.out.println("In main method y value:"+obj.y);
		obj.calculate(obj);
		System.out.println("In main method after executing x value:"+obj.x);
		System.out.println("In main method after executing y value:"+obj.y);
	}
}
