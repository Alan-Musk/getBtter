/**
 * @title  after_01.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午7:20:16 

 */
package chap_04;

import java.util.Scanner;

public class after_01 {
	public static void main(String[] args) {
		System.out.println("请输入星期几");
		Scanner inpuScanner=new Scanner(System.in);
		int week=inpuScanner.nextInt();
		switch (week) {
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 7:
			System.out.println("休息");
			break;
		default:
			System.out.println("学习英语");
			break;
		}
	}
}
