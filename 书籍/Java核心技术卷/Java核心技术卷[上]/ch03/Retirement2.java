package ch02;

import java.util.Scanner;

public class Retirement2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money will you contribute every year");
		double payment=input.nextDouble();
		
		//利率
		System.out.println("Interset rate in %:");
		double intersetRate=input.nextDouble();
		
		double balance=0;
		int years=0;
		
		String in;
		
		//在用户尚未准备好注销时更新帐户余额
		do {
			balance+=payment;
			double interset=balance*intersetRate/100;
			balance+=interset;
			
			years++;
			
			System.out.printf("After year %d,your balance is %,.2f%n",years,balance);
			
			System.out.println("Ready to retire?(Y/N)");
			in=input.next();
		} while (in.equals("N"));
	}
}
