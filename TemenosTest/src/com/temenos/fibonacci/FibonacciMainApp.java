package com.temenos.fibonacci;

/*
 * this main app is to call Fibonacci problem 
 */
public class FibonacciMainApp {
	
	private static final int numberOfDigits = 1000; //this should be configurable
	
	
	public static void main(String[] args)
	{
		//findout first fibonacci having n number of digits
		FibonacciProblem fibo = new FibonacciProblem();
		System.out.println("index of the first number having "+numberOfDigits + " digits in fibonacci series="+ fibo.generateFibonacci(numberOfDigits));
		
		
	}

}
