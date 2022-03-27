package com.java;

public class Nestedif {

	public static void main(String[] args) {
		int number=5;
		if(number>0)
		{
			System.out.println("The given number is positive");
			
			if(number%2==0)
		    {
				System.out.println("The given number is even");
				
		    }
			else
			{
				System.out.println("The given number is odd");
				
			}
		}
		else
		{
			System.out.println("The given nimber is negative");
			
		}

	}

}
