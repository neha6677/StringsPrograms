package com.demoprogram;

public class String_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creating object of StringBuffer class and
        // passing our input string to it
        StringBuffer sbr = new StringBuffer("Neha");
 
        
        String str = sbr.toString();
        System.out.println(str);
        StringBuilder sbl = new StringBuilder(str);
 
        // Printing the StringBuilder object on console
        System.out.println("new "+sbl);


	}

}
