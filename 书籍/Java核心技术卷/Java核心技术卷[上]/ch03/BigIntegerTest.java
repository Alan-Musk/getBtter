package ch02;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k=input.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int number=input.nextInt();
		
		BigInteger lotteryOddsBigInteger=BigInteger.valueOf(1);
		
		for (int i = 1; i <=k; i++) {
			lotteryOddsBigInteger=lotteryOddsBigInteger.multiply(BigInteger.valueOf(number-i+1)).divide(BigInteger.valueOf(i));
		}
		System.out.println("YOUR odds are 1 in "+lotteryOddsBigInteger+".GOOD LUCK");
	}
}
