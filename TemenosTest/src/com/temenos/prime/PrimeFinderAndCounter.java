package com.temenos.prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFinderAndCounter {

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

}
