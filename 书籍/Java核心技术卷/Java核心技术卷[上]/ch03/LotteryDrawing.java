package ch02;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you need to draw?");
		int k=input.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int number=input.nextInt();
		
		//填入1,2,3,4
		int[] numbers=new int[number];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
		}
		
		int[] result=new int[k];
		for (int i = 0; i < result.length; i++) {
			int r=(int)(Math.random()*number);
			result[i]=numbers[r];
			numbers[r]=numbers[number-1];
			number--;
		}
		Arrays.sort(result);
		System.out.println("It'll make you rich");
		for (int i : result) {
			System.out.println(i);
		}
		
	}
}
