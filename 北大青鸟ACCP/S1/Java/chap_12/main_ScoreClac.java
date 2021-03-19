/**
 * @title  main_ScoreClac.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午12:57:47 

 */
package chap_12;

import java.util.Scanner;

//计算平均分和总成绩的实现方法
public class main_ScoreClac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		test_ScoreCalc scoreCalc=new test_ScoreCalc();
		System.out.println("请输入Java成绩");
		scoreCalc.java=input.nextInt();
		System.out.println("请输入C#成绩");
		scoreCalc.c=input.nextInt();
		System.out.println("请输入DB成绩");
		scoreCalc.db=input.nextInt();	
		scoreCalc.showTotalScore();
		scoreCalc.showAvg();
	}
}
