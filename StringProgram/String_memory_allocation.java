package com.demoprogram;

public class String_memory_allocation {

	public static void main(String[] args) {
		
		String s1 = "reserve";  
		String s2 = "reserve";  

		String s3 = new String("reserve"); 
		String s4 = new String("reserve"); 

		System.out.println("s1 and s2 point to a same String object ? = "+ (s1==s2));

		System.out.println("s1 and s3 point to a same String object ?  = "+ (s1==s3));

		System.out.println("s3 and s4 point to a same String object ? = "+ (s3==s4));


	}

}
