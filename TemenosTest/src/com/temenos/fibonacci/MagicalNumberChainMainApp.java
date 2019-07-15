package com.temenos.fibonacci;

public class MagicalNumberChainMainApp {
	
	private static final int upperLimit = 10000000;
	public static void main(String[] args)
	{
		//call the function that counts how many numbers are arriving at 89 in number chain
				MagicalNumberChain mnc = new MagicalNumberChain();
				long beginTime = System.currentTimeMillis();
				System.out.println("total number of numbers that are arrived to 89  continuously adding the square of the digits in a number ="+mnc.countNumbersReachMagicalInt89(upperLimit));
				System.out.println("time taken with single thread:"+(System.currentTimeMillis()-beginTime)+ " milliseconds");
	}

}
