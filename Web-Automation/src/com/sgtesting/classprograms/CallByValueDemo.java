package com.sgtesting.classprograms;
public class CallByValueDemo 
{
	
	void display(int x, int y)
	{
		x+=100;
		y+=200;
		System.out.println("In display method X:"+x);
		System.out.println("In display method Y:"+y);
		
	}
	public static void main(String[] args) 
	{
		int x,y;
		x=10;
		y=20;
		System.out.println("In main method X:"+x);
		System.out.println("In main method Y:"+y);
		
		CallByValueDemo obj=new CallByValueDemo();
		obj.display(x,y);
		
		System.out.println("After executing class value of x "+x);
		System.out.println("After executing class value of y "+y);
		
		
	}

}
