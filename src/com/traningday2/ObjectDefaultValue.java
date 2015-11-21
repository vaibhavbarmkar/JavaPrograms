package com.traningday2;

 class Test 
 {
	 //default Constructor
	 public Test()
	 {
		 System.out.println("Default Constructor");
	 }
	
	    int a;
	 
		public void display()
		{
		
			System.out.println(a);	
		}

}

public class ObjectDefaultValue{
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.display();
	}
}
