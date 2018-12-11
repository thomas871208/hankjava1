package com.tom;

public class Card {
		char[] flower = {0x2660,0x2665,0x2666,0x2663};
		int value;
		public Card(int value){
			this.value = value;
		}
		public String get(){
			String [] n = {"\u0041","2","3","4","5","6","7","8","9","10","\u004A","\u0051","\u004B"};
			int num = value%13;
			int number = value/13;
			return n [num] + flower[number];
		} 
		
}
