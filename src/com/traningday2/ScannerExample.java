package com.traningday2;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Enter your name");
		name = sc.next();
		
		
		
		System.out.println(age);
		System.out.println(name);
		
		sc.close();
		
		
	}
	
	

}
