/**
 * @title  after_03.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月5日 下午2:34:16 

 */
package chap_02;

import java.util.Scanner;

public class after_03 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("请输入您的本金");
		double money=inputScanner.nextDouble();
		System.out.println("本金为:"+money);
		double first=0.0225*money+money;//第一年本息
		double second=0.027*(int)first+(int)first;//第二年本息f
		double Third=0.0324*(int)second+(int)second;//第三年本息
		double Fourth=0.036*(int)Third+(int)Third;//第五年本息
		System.out.println("存取一年后的本息是:"+first);
		System.out.println("存取两年后的本息是"+second);
		System.out.println("存取三年后的本息是"+Third);
		System.out.println("存取五年后的本息是"+Fourth);
	}
}
