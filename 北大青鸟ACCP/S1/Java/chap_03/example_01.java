/**
 * @title  example_01.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午5:23:53 

 */
package chap_03;

import java.util.Scanner;

public class example_01 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("输入张浩的Java成绩:");//提示输入Java成绩
		int score=inputScanner.nextInt();//从控制台获取张浩的Java成绩
		if (score>98) {
			System.out.println("老师说:不错,奖励一个MP4");
		}
	}
}
