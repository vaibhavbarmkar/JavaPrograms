package com.traningday2;

public class Bird {	
	
	static int count;
	
	int wings;
	int legs;
	
	public Bird()
	{
		count++;
	}
	
	//tp print properties of object
	public void properties()
	{
		System.out.println( "Number of wings" + " " + wings);
		System.out.println("Number of legs" + " " + legs);
	}
	
	//Behavior of object 
	public void fly()
	{
		System.out.println("Fly");
	}
	
	public static void main(String[] args) {
		
		Bird b1 = new Bird();
	Bird b3 = new Bird();
	
	Bird b2 = new Bird();
	
		

		System.out.println(b1.count);
		
	}
	
}

