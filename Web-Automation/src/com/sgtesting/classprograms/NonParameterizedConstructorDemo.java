package com.sgtesting.classprograms;

class Abd 
{
	Abd() 
	{
		String name="namita";
		System.out.println(name);
	}
}
public class NonParameterizedConstructorDemo 
{
	public NonParameterizedConstructorDemo()
	{
		int age=10;
		System.out.println(age);
	}
	
	

	public static void main(String[] args) 
	{
		NonParameterizedConstructorDemo obj2=new NonParameterizedConstructorDemo();
		Abd obj5=new Abd();
		

	}

}
