package ch02;

import java.io.Console;
import java.nio.file.Path;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//get first input
		System.out.println("What is your name?");
		String nameString=input.nextLine();
		
		//get second input
		System.out.println("How old are you");
		int age=input.nextInt();
		
		//display output on console
		System.out.println("Hello,"+nameString+".Next year,you'll ne"+(age+1));
	}
}