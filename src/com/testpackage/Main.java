package com.testpackage;

public class Main {

    public static void main(String[] args) {
	    String s1="Текст, с несколькими запятыми И точками";
	    int n=0;
	    for(int i=0;i<s1.length();i++) {
	        char s=s1.charAt(i);
	        if(s==','||s=='.'||s=='?'||s=='!'){
	            n++;
            }
        }
		if(n==1||n%10==1&&n!=11) {
			System.out.print("В тексте " + '"' + s1 + '"' + " " + n + " знак препинания.");
		}
		if(n>1&&n<5||n%10>1&&n%10<5&&n!=12&&n!=13&&n!=14) {
			System.out.print("В тексте " + '"' + s1 + '"' + " " + n + " знака препинания.");
		}
		else {
			System.out.print("В тексте " + '"' + s1 + '"' + " " + n + " знаков препинания.");
		}
    }
}
