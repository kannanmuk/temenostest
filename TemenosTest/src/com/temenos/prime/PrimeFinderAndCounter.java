package com.temenos.prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFinderAndCounter {
	
	private int counter = 0;
	private int startIndex = 0;
	private int endIndex = 0;

	List<BigInteger> getAllRotations(BigInteger prime) {
		List<BigInteger> rotations = new ArrayList<BigInteger>();
		rotations.add(prime);
		int size = prime.toString().length();
		for (int i = size - 1; i >= 1; i--) {
			int lastPart = (int) (prime.intValue() / Math.pow(10, i));
			int firstPart = (int) (prime.intValue() % Math.pow(10, i));
			int finalValue = (int) (firstPart * Math.pow(10, size - i) + lastPart);
			rotations.add(new BigInteger(String.valueOf(finalValue)));
		}
		return rotations;
	}

	boolean checkIfPrime(int num) {
		
		

		if (num > 2) {
			if(String.valueOf(num).endsWith("0") || String.valueOf(num).endsWith("5") || String.valueOf(num).endsWith("2") || 
					String.valueOf(num).endsWith("4") || String.valueOf(num).endsWith("6") || String.valueOf(num).endsWith("8"))
			{
				return false;
			}
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}

		return true;

	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		counter = counter;
	}
	
	public int findTheListOfCircularPrimes(int startIndex,int endIndex)
	{
		int counter=0;
		for(int i=startIndex;i<endIndex;i++)
		{
			if(checkIfPrime(i))
			{
				List<BigInteger> list = getAllRotations(BigInteger.valueOf(i));
				Set<Integer> primes=new HashSet<>();
				boolean circularPrime = true;
				for(BigInteger listValue:list)
				{
					if(!checkIfPrime(listValue.intValue()))
					{
						circularPrime = false;
						break;
					}
				}
				if(circularPrime)
				{
					counter++;
					
				}
			}
		}
		
	  setCounter(counter);
	  return counter;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

}
