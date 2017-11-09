package com.testpackage;

public class Main {

	public static void main(String[] args) {
		String sourceData = "Текст, с несколькими? запятыми,, И точками";
		int countPunctuation = 0;
		for (int i = 0; i < sourceData.length(); i++) {
			char symbol = sourceData.charAt(i);
			if (symbol == ',' || symbol == '.' || symbol == '?' || symbol == '!') {
				countPunctuation++;
			}
		}
		if (countPunctuation == 1 || countPunctuation % 10 == 1 && countPunctuation != 11) {
			System.out.print("В тексте " + '"' + sourceData + '"' + " " + countPunctuation + " знак препинания.");
		}
		else if (countPunctuation > 1 && countPunctuation < 5 || countPunctuation % 10 > 1 && countPunctuation % 10 < 5 && countPunctuation != 12 && countPunctuation != 13 && countPunctuation != 14) {
			System.out.print("В тексте " + '"' + sourceData + '"' + " " + countPunctuation + " знака препинания.");
		}
		else {
			System.out.print("В тексте " + '"' + sourceData + '"' + " " + countPunctuation + " знаков препинания.");
		}
	}
}
