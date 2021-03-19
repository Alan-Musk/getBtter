/**
 * @title  example_03.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午8:03:44 

 */
package chap_09;

import java.util.Scanner;

public class example_03 {
	public static void main(String[] args) {
		int[] score=new int[4];//成绩数组
		int classNum=3;//班级数量
		double sum=0;//成绩综合
		double[] average=new double[classNum];//平均成绩数组
		int count=0;//记录85分以上学员人数
		//循环输入学员成绩
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < classNum; i++) {
			sum=0;//成绩总和归0
			System.out.println("请输入第"+(i+1)+"个班级的成绩");
			for (int j = 0; j <score.length; j++) {
				System.out.println("第"+(j+1)+"个学员的成绩:");
				score[j]=input.nextInt();
				sum=sum+score[j];
				if (score[j]<85) {//小于85,跳出循环
					continue;
				}
				count++;
			}
			average[i]=sum/score.length;
			System.out.println("第"+(i+1)+"个班级参赛学员的平均分是:"+average[i]);
			System.out.println();
		}
		System.out.println("成绩85分以上的学员人数有"+count+"人");
	}
}
