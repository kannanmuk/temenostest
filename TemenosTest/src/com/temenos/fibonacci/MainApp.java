package com.temenos.fibonacci;

public class MainApp {
	
	private static final int numberOfDigits = 3; //this should be configurable
	private static final int upperLimit = 10000000;
	
	public static void main(String[] args)
	{
		//findout first fibonacci having n number of digits
		FibonacciProblem fibo = new FibonacciProblem();
		System.out.println("index of the first number having "+numberOfDigits + " digits in fibonacci series="+ fibo.generateFibonacci(numberOfDigits));
		
		//call the function that counts how many numbers are arriving at 89 in number chain
		MagicalNumberChain mnc = new MagicalNumberChain();
		long beginTime = System.currentTimeMillis();
		System.out.println("total ="+mnc.countNumbersReachMagicalInt89(upperLimit));
		System.out.println("time taken with single thread:"+(System.currentTimeMillis()-beginTime));
	}

}
