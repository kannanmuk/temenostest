package com.temenos.oddeven;

public class EvenOddIterativeChain {
	
	
	
	public int applyEvenLogic(int n)
	{
		return n/2;
	}
	public int applyOddLogic(int n)
	{
		return (3*n) + 1;
	}
	public int generateChain(int result)
	{
		int chainLength = 1;
		while(result != 1)
		{
			//this condition is to check whether the number is power of 2 during chain generation
			// if so then we don't need to generate chain , but simply use what power of 2 is this and that number to chain length
			if(result != 2 && (int)(Math.ceil((Math.log(result) / Math.log(2)))) ==  
       (int)(Math.floor(((Math.log(result) / Math.log(2))))))
			{
				chainLength = chainLength+(int)(Math.ceil((Math.log(result) / Math.log(2)))) -1 ;
				result = 2;
			}
			if(result % 2 ==0)
			{
				result = applyEvenLogic(result);
				
			}
			else
			{
				result = applyOddLogic(result);
			}
			chainLength++;
		}
		
		return chainLength;
	}
	
	//this is plain logic to generate chain without applying power of 2 logic, it takes more time for bigger numbers
	public int generateChainPlain(int result)
	{
		int chainLength = 1;
		while(result != 1)
		{
			
			if(result % 2 ==0)
			{
				result = applyEvenLogic(result);
				
			}
			else
			{
				result = applyOddLogic(result);
			}
			chainLength++;
		}
		
		return chainLength;
	}

}
