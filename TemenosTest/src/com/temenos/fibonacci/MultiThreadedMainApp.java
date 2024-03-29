package com.temenos.fibonacci;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author kmudadla
 * This main app uses 10 threads to find out the total number of numbers that arrive at 89 
 * by doing square and adding continuously , each thread handles 1 million numbers
 */

public class MultiThreadedMainApp {
	
	public static void main(String[] args)
	{
		int million = 1000000;
		ExecutorService ex = Executors.newFixedThreadPool(10);
		int count=0;
		long beginTime = System.currentTimeMillis();
		for(int i=1;i<=10;i++)
		{
			MagicalNumberChain obj = new MagicalNumberChain();
			if(i == 1)  obj.setStartIndex(2);
			else obj.setStartIndex((i-1)*million);
			obj.setEndIndex(i*million);
			MagicalNumberChainThread t = new MagicalNumberChainThread(obj);
			
			ex.execute(t);
			
		}
		ex.shutdown();
		try {
			ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("time taken with mutli-threading:"+(System.currentTimeMillis()-beginTime)+" milliseconds");
		System.out.println("total number of numbers that are arrived to 89 by continuously adding the square of the digits in a number ="+MagicalNumberChainThread.total);
		
	}

}
