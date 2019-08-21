package com.virtusa.numbers;

public class NumberBaseConverter implements NumberIntf {

	@Override
	public String convertToText(int num, String houseName) {
		String baseText = "";
		if (num > 0) {

			if (num / 100 > 0) {
				baseText = baseText + oneDigitWords[num / 100 - 1] + " "
						+ hundred;
				num = num % 100;
			}
			if (num > 0) {
				if (baseText.length() > 1) {
					baseText = baseText + " and ";
				}
				if (num / 10 == 1) {
					if (num % 10 == 0) {
						baseText = baseText + tensWords[num / 10 - 1] + " "
								+ houseName;
					} else {
						baseText = baseText + twoDigitWords[num % 10 - 1] + " "
								+ houseName;
					}
				} else if (num / 10 > 1) {
					baseText = baseText + tensWords[num / 10 - 1] + " ";
					baseText = baseText + oneDigitWords[num % 10 - 1] + " "
							+ houseName;
				} else if (num / 10 == 0) {
					baseText = baseText + oneDigitWords[num % 10 - 1] + " ";
				}
			} else {
				baseText = baseText + " " + houseName;
			}
		}
		return baseText;

	}

}
