package com.qa.DemoTests;

public class ExampleOE {

	public static void main(String[] args) {
		OverloadingExample oe= new OverloadingExample();
		oe.display("Mukta");
		oe.display('N', 5);
		}
	}

class OverloadingExample{
	
	//display() method is overloaded based upon the number of arguments
	public void display(String c){
		System.out.println(c);
	}
	
	public void display(char c,int num){
		System.out.println(c+ "" +num);
	}
	
	
}
