package chap_04;

import java.util.Scanner;

/**
 * @title  after_02.java 

 * @package  

 * @author alan

 * @date 2021年3月7日 下午8:32:42 

 */

public class after_02 {
	public static void main(String[] args) {
		System.out.println("刘珊珊考了多少分");
		Scanner inputScanner=new Scanner(System.in);
		if (inputScanner.hasNextInt()==true) {
			int score=inputScanner.nextInt();
			score=(int)(score/10);
			switch (score) {
			case 10:
				System.out.println("父亲给她买一辆车");
				break;
			case 9:
				System.out.println("笔记本电脑");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("买手机");
				break;
			default:
				System.out.println("没有礼物");
				break;
			}
		} else {
		System.out.println("请输入正确的分数");
		}
		
	}
}
