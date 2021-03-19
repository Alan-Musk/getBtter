/**
 * @title  test_01.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午5:06:15 

 */
package chap_09;

import java.util.Scanner;

//计算竞赛平均分
public class test_01 {
	public static void main(String[] args) {
		double sum=0;//成绩总和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位学员的成绩");
		for (int i = 0; i <4; i++) {
			System.out.println("第"+(i+1)+"位学员的成绩:");
			int score=input.nextInt();
			sum=sum+score;//总和
		}
		System.out.println("参赛学员的平均分是:"+(sum/5));
	}
}
