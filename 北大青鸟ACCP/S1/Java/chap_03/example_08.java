package chap_03;

import java.util.Scanner;

/**
 * @title  example_08.java 

 * @package  

 * @author alan

 * @date 2021年3月6日 下午2:22:54 

 */

public class example_08 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("请输入比赛成绩(s)");
		double score=inputScanner.nextDouble();
		System.out.println("请输入性别");
		String gender=inputScanner.next();
		if (score<=10) {
			if (gender.equals("男")) {
				System.out.println("进入男子组决赛");
			} else if (gender.equals("女")) {
				System.out.println("进入女子组决赛");
			}
		} else {
			System.out.println("淘汰");
		}
	}
}
