package com.temenos.fibonacci;

import java.io.IOException;
import java.math.BigInteger;

/**
 * 
 * @author kmudadla
 * The Fibonacci sequence is defined by the recurrence relation:

  * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

  * The 12th term, F12, is the first term to contain three digits.

  * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class FibonacciProblem {
	
	private static final int numberOfDigits = 1000; //this should be configurable
	private static BigInteger f1 = new BigInteger("1");
	private static BigInteger f2 = new BigInteger("1");
	
	public static void main(String[] args)
	{
		System.out.println("index of the first number having "+numberOfDigits + " digits in fibonacci series="+ generateFibonacci(numberOfDigits));
	}
	
	private static int generateFibonacci(int digits)
	{
		int index = 3;
		BigInteger fibonacciAtIndex=null;
		if(digits == 1){
			return 1;
		}
		else
		{
		while(true)
		{
			fibonacciAtIndex=f2.add(f1);
			
			if(fibonacciAtIndex.toString().length() == digits)
			{				
				System.out.println("fn-1 and fn-2 are:"+f1+" "+f2);
				return index;
			}
			f1=f2;
			f2=fibonacciAtIndex;			
			index++;
		}
		}
	}

}
