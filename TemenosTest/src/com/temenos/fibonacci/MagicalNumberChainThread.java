package com.temenos.fibonacci;

public class MagicalNumberChainThread implements Runnable {
	
	MagicalNumberChain obj;
	private int count;
	public static int total=0;
	
	public MagicalNumberChainThread(MagicalNumberChain obj)
	{
		this.obj=obj;
	}
		
	public void run()
	{
		setCount(obj.countNumbersReachMagicalInt89(obj.getStartIndex(), obj.getEndIndex()));
		
		total = total+getCount();
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
