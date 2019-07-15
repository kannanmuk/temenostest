package com.temenos.prime;

public class PrimeFinderThread implements Runnable{
	
	PrimeFinderAndCounter primeObj;
	private int count;
	public static int total=0;

	public PrimeFinderThread(PrimeFinderAndCounter primeObj)
	{
		this.primeObj = primeObj;
	}

	@Override
	public void run() {
		
		setCount(primeObj.findTheListOfCircularPrimes(primeObj.getStartIndex(),primeObj.getEndIndex()));
		total = total + getCount();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
