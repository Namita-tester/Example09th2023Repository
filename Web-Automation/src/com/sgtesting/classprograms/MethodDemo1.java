package com.sgtesting.classprograms;

public class MethodDemo1
{
	int age;
	String course;
	
	void display()
	{
		String name="Hello java";
		System.out.println(name);
	}
	void display(int age)
	{
		this.age=age;
		System.out.println(age);
	}
	void display(String course)
	{
		this.course=course;
		System.out.println(course);
	}
	
	public static void main(String args[])
	{
		MethodDemo1 obj=new MethodDemo1();
		obj.display();
		int y=10;
		obj.display(y);
		obj.display("Software_Testing");
	}
	
	
	
	
	
	
}
