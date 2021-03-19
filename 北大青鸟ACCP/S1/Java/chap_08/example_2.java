/**
 * @title  example_2.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午5:11:27 

 */
package chap_8;

import java.util.Arrays;
import java.util.Scanner;

public class example_2 {
	public static void main(String[] args) {
		double[] student=new double[5];//定义学生数量数组
		System.out.println("请输入五位学员的成绩:");
		Scanner input = new Scanner(System.in);
		//循环录入
		for (int i = 0; i < student.length; i++) {
			student[i]=input.nextDouble();
		}
		Arrays.sort(student);//对数组进行升序排序
		System.out.println("学员成绩按升序排列:");
		//循环输出学员成绩
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
}
