/**
 * @title  after_03.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午11:24:46 

 */
package chap_09;

import java.util.Scanner;

public class after_03 {
	public static void main(String[] args) {
		int[] score=new int[4];//成绩数组
		int classNum=3;//班级数量
		double sum=0;//超过85分成绩总和
		int num=0;//超过85分学生总和
		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < classNum; i++) {
			//外层循环控制班级数量
			System.out.println("请输入第"+(i+1)+"个班级的成绩");
			for (int j = 0; j < score.length; j++) {
				//内层循环控制每个班级的参赛人数
				System.out.print("第"+(j+1)+"个学员的成绩:");
				score[j]=input.nextInt();
				//增加成绩和和学生和
				if (score[j]>=85) {
					sum=sum+score[i];
					num++;
				}
			}
			System.out.println();
		}
		System.out.println("超过85分的平均分是"+sum/num);
	}
}
