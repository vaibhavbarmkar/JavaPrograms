package com.traningday2;

public class VariableScope {
	
	public static void main(String[] args) {
		
		Scope obj = new Scope();
		
		Scope obj1 = new Scope();
		
		obj1.a=60;
		obj1.s=70;
		
		obj.a=50;
		obj.s=20;
		
		obj.display();
		obj1.display();
		
		
	}
	

}

class Scope

{
	static int s=10;
	int a ;
	
	public void display ()
	{
		//int temp=0;
		System.out.println(a);
		System.out.println(s);
		//System.out.println(temp);
		
	}
	
	
	
	
}
