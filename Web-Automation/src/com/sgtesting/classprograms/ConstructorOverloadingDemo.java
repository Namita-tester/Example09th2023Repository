package com.sgtesting.classprograms;

public class ConstructorOverloadingDemo 
{
	String course;
	int age;
	
	ConstructorOverloadingDemo()
	{
		String name="namita";
		System.out.println(name);
	}
	
	ConstructorOverloadingDemo(String course)
	{
		this.course=course;
		System.out.println(course);
	}
	
	ConstructorOverloadingDemo(int age)
	{
		this.age=age;
		System.out.println(age);
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloadingDemo obj=new ConstructorOverloadingDemo();
		ConstructorOverloadingDemo obj1=new ConstructorOverloadingDemo("Testing");
		ConstructorOverloadingDemo obj2=new ConstructorOverloadingDemo(123);

	}

}
