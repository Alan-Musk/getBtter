/**
 * @title  example_06.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午3:24:05 

 */
package chap_06;

import java.util.Scanner;

public class example_06 {
	public static void main(String[] args) {
		int score; //每门课的成绩
		int sum=0;//成绩之和
		double avg=0;//平均分
		boolean isNegative=false;//是否为负数
		Scanner input=new Scanner(System.in);
		System.out.println("输入学生姓名:");
		String nameString=input.next();//输入姓名
		for (int i = 0; i <5; i++) {//循环5次,录入5门课成绩
			System.out.println("请输入第"+(i+1)+"门课的成绩:");
			score=input.nextInt();
			if (score<0) {
				//输入负数
				isNegative=true;
				break;
			}
			sum=sum+score;
		}
		if (isNegative) {
			System.out.println("抱歉,分数录入错误,请重新进行录入!");
		}else {
			avg=(double)sum/5;
			System.out.println(nameString+"的平均分是"+avg);
		}
	}
}
