package com.temenos.oddeven;

public class EvenOddMainApp {
	
	private static int num = 100000;
	
	public static void main(String[] args)
	{
		EvenOddIterativeChain obj = new EvenOddIterativeChain();
		int tempLength=0;
		int tempValue = 1;
		//outer loop is to run 10 iterations 
		for(int outer=1;outer<=10;outer++)
		{
			//this inner loop will generate chains for each lakh of integers 
		for(int i=((outer-1)*num)+1;i<=outer*num;i++)
		{
		int chainLength = obj.generateChain(i);
		if(chainLength > tempLength)
		{
			tempLength = chainLength;
			tempValue = i;
		}
		}
		}
		
		System.out.println("max length="+tempLength+ " number has maxLength chain:"+tempValue);
	}

}
