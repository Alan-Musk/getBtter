/**
 * @title  example_03.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午1:03:36 

 */
package chap_12;

import java.util.Scanner;

public class example_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		接收成绩
		System.out.println("请输入Java成绩");
		int java=input.nextInt();
		System.out.println("请输入C#成绩");
		int c=input.nextInt();
		System.out.println("请输入DB成绩");
		int db=input.nextInt();	
//		计算并显示输出
		int total=java+c+db;
		double avg=total/3.0;
		System.out.println("总成绩是:"+total);
		System.out.println("平均分是:"+avg);
	}
}
