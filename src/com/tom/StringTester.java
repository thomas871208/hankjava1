package com.tom;

public class StringTester {

	public static void main(String[] args) {
	String s = "Hello World";
	//   		0123456789¤Q	
	System.out.println(s.substring(6));
	System.out.println(s.substring(2,9));
	for(int i=10;i>=0;i--){
		System.out.print(s.substring(i,i+1));
		
	}
	System.out.println("");
	String s2 = new String("Jack Tom Eric");
	//			            0123456789012
	System.out.println(s2.indexOf("c"));
	String name = "Tom";
	int index = s2.indexOf(name);
    System.out.println(s2.substring(0,index) +"boss"+ s2.substring(index+name.length(),s2.length()));
	
    int n = Integer.parseInt("13");
    float f = Float.parseFloat("46.2");
    
    
	}

}
