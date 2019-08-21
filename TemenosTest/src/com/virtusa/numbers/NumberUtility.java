package com.virtusa.numbers;

public class NumberUtility {
	
	private NumberBaseConverter numberConv = new NumberBaseConverter();
	private int million = 1000000;
	private int thousands = 1000;
	public int getMillionsPart(int num)
	{
		return num/million;
	}
	public int getThousandsPart(int num)
	{
		num = num % million;
		return num/thousands;
	}
	public int getHundredsPart(int num)
	{
		return num % thousands;
	
	}
	
	public String getTextOfNumber(int num)
	{
		if (num > 999999999) {
			try {
				throw new Exception("entered number is outside range" + num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String mil = numberConv.convertToText(getMillionsPart(num),
				"million");
		String thousands = numberConv.convertToText(
				getThousandsPart(num), "thousand");
		String finalPart = numberConv.convertToText(
				getHundredsPart(num), "");

		return (mil + " " + thousands + " " + finalPart);
	}

}
