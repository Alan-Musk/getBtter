/**
 * @title  example_01.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午5:06:54 

 */
package chap_8;

import java.util.Scanner;

public class example_01 {
	public static void main(String[] args) {
		int[] scores=new int[5];//成绩数组
		int sum=0;//成绩综合
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩");
		for (int i = 0; i < scores.length; i++) {
			scores[i]=input.nextInt();
			sum=sum+scores[i];//成绩累加
		}
		//计算并输出平均分
		System.out.println("学员的平均分是:"+(double)sum/scores.length);
	}
}
