package com.temenos.prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.temenos.fibonacci.MagicalNumberChain;
import com.temenos.fibonacci.MagicalNumberChainThread;

public class PrimeMultiThreadedMaiApp {
	
	
	public static void main(String[] args)
	{
		
		int million = 100000;
		ExecutorService ex = Executors.newFixedThreadPool(10);
		int count=0;
		long beginTime = System.currentTimeMillis();
		for(int i=1;i<=10;i++)
		{
			PrimeFinderAndCounter obj = new PrimeFinderAndCounter();
			if(i == 1)  obj.setStartIndex(2);
			else obj.setStartIndex((i-1)*million);
			obj.setEndIndex(i*million);
			PrimeFinderThread t = new PrimeFinderThread(obj);
			
			ex.execute(t);
			
		}
		ex.shutdown();
		try {
			ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("time="+(System.currentTimeMillis()-beginTime));
		System.out.println("total count="+PrimeFinderThread.total);
		
	}

}
