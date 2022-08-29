package com.demoprogram;

public class Vowel {

	public static void main(String[] args) {
		
		
			
		String s = "harry";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1);
        
	}
}
