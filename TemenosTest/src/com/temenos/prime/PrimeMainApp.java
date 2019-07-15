package com.temenos.prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeMainApp {
	
	
	private static int num = 1000000; //set the number here below which the total number of circular primes to be found
	
	private static List<BigInteger> masterList = new ArrayList<>();
	
	public static void main(String[] args)
	{
		PrimeFinderAndCounter finder = new PrimeFinderAndCounter();
		long timer = System.currentTimeMillis();
		System.out.println("timer="+timer);
		int counter=0;
		for(int i=2;i<num;i++)
		{
			if(finder.checkIfPrime(i))
			{
				List<BigInteger> list = finder.getAllRotations(BigInteger.valueOf(i));
				Set<Integer> primes=new HashSet<>();
				boolean circularPrime = true;
				for(BigInteger listValue:list)
				{
					if(!finder.checkIfPrime(listValue.intValue()))
					{
						circularPrime = false;
						break;
					}
				}
				if(circularPrime)
				{
					counter++;
					masterList.addAll(list);
				}
			}
		}
		
		finder.setCounter(counter);
		System.out.println("total="+counter);
		System.out.println("time="+(System.currentTimeMillis()-timer));
		
	}

}
