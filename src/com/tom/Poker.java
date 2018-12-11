package com.tom;

import java.util.Random;

public class Poker {
	Card[] cards = new Card[52];
		public Poker() {
			for (int i=0 ; i < 52; i++ ) {
				cards [i] = new Card(i);
				
			}
				}

        public void shuffle(){
        	Random random = new Random();
        	for (int i = 0; i< 52;i++){
        		int tmp = random.nextInt(52);
        		
        		
        	}
        }
		public void add(){
			
		}
		
		public void  print(){ 
				for (int i=0 ; i < 52; i++ ) {
					System.out.print(cards[i].get());
				/*char [] m = {0x2660,0x2665,0x2666,0x2663};
				String [] n = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
				if (i%13 == 12){
					System.out.println(n[i%13] + "" + m[i/13] + " ");
				}
				else {
					System.out.print(n[i%13] + "" + m[i/13] + " " );
				}*/
				}
		}
}
