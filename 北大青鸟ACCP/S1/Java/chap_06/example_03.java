/**
 * @title  example_03.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午1:40:15 

 */
package chap_06;

import java.util.Scanner;

public class example_03 {
	public static void main(String[] args) {
		int score=0;//每门课的分数
		int sum=0;//成绩之和
		double avg=0;//平均分
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("请输入学习姓名:");
		String nameString=inputScanner.next();
		for (int i = 0; i < 5; i++) {
			//循环5次,录入五门课的成绩
			System.out.println("请输入5门课中的第"+(i+1)+"课的成绩:");
			score=inputScanner.nextInt();//录入成绩
			sum=sum+score;//计算成绩和
		}
		avg=(double)sum/5;
		System.out.println(nameString+"的平均分是"+avg);
	}
}
