/**
 * @title  example_01.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午6:24:53 

 */
package chap_09;

import java.util.Scanner;

public class example_01 {
	public static void main(String[] args) {
		int[] score=new int[4];//成绩数组
		int classNum=3;//班级数量
		double sum=0;//成绩总和
		double[] average=new double[classNum];//平均成绩数组
		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < classNum; i++) {
			//外层循环控制班级数量
			sum=0;//总和归0
			System.out.println("请输入第"+(i+1)+"个班级的成绩");
			for (int j = 0; j < score.length; j++) {
				//内层循环控制每个班级的参赛人数
				System.out.print("第"+(j+1)+"个学员的成绩:");
				score[j]=input.nextInt();
				sum=sum+score[j];
			}
			average[i]=sum/score.length;//计算平均分
			System.out.println("第"+(i+1)+"个班级参赛学员的平均分是:"+average[i]);
			System.out.println();
		}
	}
}
