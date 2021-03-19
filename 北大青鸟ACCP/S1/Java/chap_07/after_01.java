/**
 * @title  after_01.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午2:48:40 

 */
package chap_07;

import java.util.Scanner;

//输出该数的阶乘
public class after_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数(10以内)");
		int sum=1;//总和
		int num=input.nextInt();
		if (num<1||num>10) {
			System.out.println("输入有误,请按规定输入");
		}
//		for (int i = num; i>1; i--) {
//			sum=sum*i;
//		}
		for (int i = 1; i <= num; i++) {
			sum=sum*i;
		}
		System.out.println(sum);
	}
}
