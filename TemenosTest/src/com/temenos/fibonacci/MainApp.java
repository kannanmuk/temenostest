package com.temenos.fibonacci;

public class MainApp {
	
	private static final int numberOfDigits = 3; //this should be configurable
	
	public static void main(String[] args)
	{
		FibonacciProblem fibo = new FibonacciProblem();
		System.out.println("index of the first number having "+numberOfDigits + " digits in fibonacci series="+ fibo.generateFibonacci(numberOfDigits));
	}

}
