package ch02;

import java.util.*;

/**
 * @class:Retirement
 * @date:2021年7月6日 上午1:36:34
 * @author Alan
 * This program demonstrates a<code>while</code>loop
 */
public class Retirement {
	public static void main(String[] args) {
		//read inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money do you need to retire?");
		double goal=input.nextDouble();
		
		System.out.println("How much money will you contribute every year");
		double payment=input.nextDouble();
		
		//利率
		System.out.println("Interset rate in %:");
		double intersetRate=input.nextDouble();
		
		double balance=0;
		int years=0;
		
		while(balance<goal){
			balance+=payment;
			double interset=balance*intersetRate/100;
			balance+=interset;
			years++;
		}
		
		System.out.println("You can retire in"+years+"year.");
	}
}
