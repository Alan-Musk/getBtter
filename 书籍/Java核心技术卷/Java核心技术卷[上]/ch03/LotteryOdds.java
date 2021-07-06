package ch02;

import java.util.Scanner;

public class LotteryOdds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k=input.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int number=input.nextInt();
		
		int lotteryOdds=1;
		for (int i = 1; i <=k; i++) {
			lotteryOdds=lotteryOdds*(number-i+1)/i;
		}
		System.out.println("YOU odds are 1 in "+lotteryOdds+",GOOD LUCK");
	}
}
