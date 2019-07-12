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
	
	
	private BigInteger f1 = new BigInteger("1"); //first fibonacci number
	private BigInteger f2 = new BigInteger("1"); //second fibonacci number
	
	private int index = 3; //programmatic fibonacci numbers generated from index 3
	
    int generateFibonacci(int digits)
	{		
		BigInteger fibonacciAtIndex=null;
		//if the number to be found is with 1 digit then hardcode it
		if(digits == 1){
			return 1;
		}
		else
		{
		while(true)
		{
			fibonacciAtIndex=f2.add(f1); //Fn =  Fn-1 + Fn-2
			//Main business logic is here which checks whether the number of digits in 
			//generated bigint are same as the required number of digits
			if(fibonacciAtIndex.toString().length() == digits) 
			{				
				System.out.println("fn-1 and fn-2 are:"+f1+" "+f2);
				return index;
			}
			//if number is not yet found, then update the Fn-1,Fn-2 and increment the index
			f1=f2;
			f2=fibonacciAtIndex;			
			index++;
		}
		}
	}

}
