package com.virtusa.numbers;

public interface NumberIntf {
	
	public final String[] oneDigitWords = {"one" ,"two","three","four","five","six","seven","eight","nine"};
	public final String[] twoDigitWords = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public final String[] tensWords = {"ten","twenty","thirty","forty","fifty","sixsty","seventy","eighty","ninety"};
	public final String hundred = "hundred";
	String convertToText(int num,String houseName);

}
