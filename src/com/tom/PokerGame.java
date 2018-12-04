package com.tom;

import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PokerGame {

	public static void main(String[] args) {
		Random random = new Random();
	
		Poker poker = new Poker();
		poker.print();
		
		
		/*int[] num = new int[5];
		 num[0] = 50;
		 num[4] = 100;
		 for(int i=0; i < num.length; i++){
			 System.out.println(num[i]);
		 }
		 System.out.println(num.length);
		 System.out.println(num[4]);*/
		
		 /*for(int i=0; i <4; i++){
		 char [] m = {0x2660,0x2665,0x2666,0x2663}; 
		System.out.println(m[i]);
		//0x2660是黑桃,0x2665是愛心,0x2666是菱形,0x2663是梅花
		 }*/
		
		/*int number = (random.nextInt(13)+1);
		char mark[] = {'S','H','D','C',};
		int index = (random.nextInt(4));
		System.out.print(number);
		System.out.println(mark[index]);*/
		
		/*int number = (random.nextInt(13)+1);
		int index = random.nextInt(3);
		
		char s = 0;
		switch (index) {
		case 0:
				s = 'H';
				break;
		case 1:
			    s = 'D';
			    break;
		case 2:
			    s = 'C';
			    break;
			default:
				s = 'S';
				break;
			}
		System.out.print(number);
		System.out.println(s);*/
		
		
	}

}
