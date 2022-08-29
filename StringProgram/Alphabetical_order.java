package com.demoprogram;

public class Alphabetical_order {

	public static void main(String[] args) {
		
		String str = "language";
		int length=str.length();
		//A=65, B=66... Z=90
		//a=97, b=98 z=
		String str1="";
		char ch;
		for(int i=65;i<=90;i++) {
			
			for(int j=0;j<length;j++) {
				ch=str.charAt(j);
				
				if(ch==(char)i||ch==(char)(i+32)) {
					str1=str1+ch;
				}
			}
		}
		System.out.println(str1);
		//decending
		 char[] s = "language".toCharArray();
		 int i, n = s.length;
	        char t;
	        for (i = 0; i < n / 2; i++)
	        {
	            t = s[i];
	            s[i] = s[n - i - 1];
	            s[n - i - 1] = t;
	        }
	        System.out.println(s);
	        System.out.println(String.valueOf(s));
	}

}
