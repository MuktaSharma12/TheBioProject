package com.qa.DemoTests;

	class Animal
	{
		public void run(){
			System.out.println("Animal is running");
		}
		
	public static class Dog extends Animal
	{
		public void run()
		{
			System.out.println("Dog is running");
		}
		public static void main(String[] args) {
			Dog d=new Dog();
			d.run();
		}
	}
		
	}
	
	

