package com.sgtesting.classprograms;

public class InnerOuterDemo 
{
	String name="namita";
	Inner obj1=new Inner();
	void display()
	{
		System.out.println(obj1.age);
	}
	class Inner
	{
		int age=19;
		void display1()
		{
			System.out.println(name);
		}
		
	}
		public static void main(String[] args)
		{
			InnerOuterDemo obj=new InnerOuterDemo();
			obj.display();
			obj.obj1.display1();
		}
}
