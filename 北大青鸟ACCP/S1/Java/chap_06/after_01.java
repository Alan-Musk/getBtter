/**
 * @title  after_01.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午6:14:05 

 */
package chap_06;

import java.util.Scanner;

//for循环,接受从周一到周五的学习时间
public class after_01 {
	public static void main(String[] args) {
		int time=0;//每日的学习时间
		int sum=0;//学习时间和
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入周一的学习时间");
			time=input.nextInt();
			sum=sum+time;
		}
		System.out.println("平均时间是:"+(sum/5)+"小时");
	}
}
