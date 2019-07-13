package com.temenos.fibonacci;
/**
 * 
 * @author kmudadla
 * A number chain is created by continuously adding the square of the digits in a number 
 * to form a new number until it has been seen before
 * any chain that arrives at 1 or 89 will become stuck in an endless loop. 
 * What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.
 * This class provides a function to findout the number of numbers that will arrive at 89 which are less than a given input number
 */
public class MagicalNumberChain {
	
	private static final int magicalInt1 = 1;
	private static final int magicalInt89 = 89;
	
	int countNumersReachMagicalInt89(int upperLimit)
	{
		int counter=0;
		for(int i=2;i<upperLimit;i++)
		{
			if(generateChainAndFind89Reached(i))
			{
				counter++;
			}
		}
		return counter;
	}
	
	private boolean generateChainAndFind89Reached(int start)
	{
		int output = start;
		
		while(output != 1 && output != 89)
		{
			output = squareAndAdd(output);
			
		}
		
		if(output == 89)
		{
			return true;
		}
		return false;
	}
	
	private int squareAndAdd(int n)
	{
		int squareAndAdd=0;
		while(n/10 > 0)
		{
			int digit = n%10;
			squareAndAdd = squareAndAdd + (digit*digit);
			n =  n/10;
		}
		squareAndAdd = squareAndAdd + (n*n); //this adds the square of final digit which is less than 10
		
		return squareAndAdd;
	}
	

}
