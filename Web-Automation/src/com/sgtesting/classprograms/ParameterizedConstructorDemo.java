package com.sgtesting.classprograms;

public class ParameterizedConstructorDemo 
{
	String name;
	ParameterizedConstructorDemo(String name)
	{
		this.name=name;
		//System.out.println(name);
	}

	public static void main(String[] args) 
	{
		ParameterizedConstructorDemo ob=new ParameterizedConstructorDemo("namita");
		System.out.println(ob.name);
	
	}

}
