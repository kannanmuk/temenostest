package com.virtusa.numbers;

import java.util.Scanner;

public class NumberWords {

	public static void main(String args[]) {

		NumberUtility util = new NumberUtility();
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			if (num > 999999999) {
				throw new Exception("entered number is outside range" + num);
			}
			System.out.println(util.getTextOfNumber(num));
		} catch (Exception e) {
			System.out.println("Out of range!" + e.getMessage());
		}

	}

}
