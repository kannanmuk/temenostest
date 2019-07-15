package com.temenos.oddeven;

public class Experiments {
	
	public static void main(String[] args)
	{
		EvenOddIterativeChain obj = new EvenOddIterativeChain();
		int tempLength=0;
		int tempValue = 1;
		
		for(int i=13;i<=13;i++)
		{
		int chainLength = obj.generateChainPlain(i);
		if(chainLength > tempLength)
		{
			tempLength = chainLength;
			tempValue = i;
		}
		}
		
		
		System.out.println("length="+tempLength+ " number has maxLength chain:"+tempValue);
	}

}
