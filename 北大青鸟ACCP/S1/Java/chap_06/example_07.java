/**
 * @title  example_07.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午3:32:36 

 */
package chap_06;

import java.util.Scanner;

public class example_07 {
	public static void main(String[] args) {
		int score=0;//成绩
		int total=0;//班级总人数
		int num=0;//成绩大于或等于80分的人数
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("输入班级总人数");
		total=inputScanner.nextInt();//输入班级总数
		for (int i = 0; i < total; i++) {
			System.out.println("请输入第"+(i+1)+"位学生的成绩:");
			score=inputScanner.nextInt();
			if (score<80) {
				continue;
			}
			num++;
		}
		System.out.println("80分以上的学生人数是:"+num);
		double rate=(double)num/total*100;
		System.out.println("80分以上的学生所占的比例是:"+rate+"%");
	}
}
