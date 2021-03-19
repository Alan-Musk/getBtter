/**
 * @title  example_03.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午9:15:35 

 */
package chap_8;

import java.util.Scanner;

public class example_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score=new int[5];//分数数组
		int max=0;//记录最大值
		//..循环录入5位学员成绩
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入五位学生的成绩");
			score[i]=input.nextInt();
		}
		//计算最大值
		max=score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i]>max) {
				max=score[i];
			}
		}
		System.out.println("最大值是"+max);
	}
}
