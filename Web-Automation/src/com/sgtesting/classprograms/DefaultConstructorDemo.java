package com.sgtesting.classprograms;
class Abc
{
	String job="Got";
}

public class DefaultConstructorDemo 
{	
	String name="Namita";
	int age=29;
	String course="Software Testing";
	String institute="S G Testing";
	
	public static void main(String[] args)
	{
		DefaultConstructorDemo obj=new DefaultConstructorDemo();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.course);
		System.out.println(obj.institute);
		Abc obj1= new Abc();
		System.out.println(obj1.job);
	}

}
