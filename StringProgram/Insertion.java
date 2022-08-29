package com.demoprogram;

public class Insertion {

	private static char charAt;

	public static  void main(String[] args) {
		String str1="Dreamstrue";
		String str2= "comes";
		int index = 5;
		
		String f=new String();
		
		for(int i=0;i<str1.length();i++) {
			f=f+str1.charAt(i);
			if(i==index) {
				f=f+str2;
			}
		}
		System.out.println(f);

	}

}
