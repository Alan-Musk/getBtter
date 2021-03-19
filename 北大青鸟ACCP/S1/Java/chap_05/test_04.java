/**
 * @title  test_04.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月9日 上午2:47:53 

 */
package chap_05;

import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		boolean isRight=true;//判断循环
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("********************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.购物结算");
		System.out.println("\t3.真情回馈");
		System.out.println("\t4.注销");
		System.out.println("********************");
		System.out.println();
		do {
			 System.out.println("请选择,输入数字:");
			 int menu=inputScanner.nextInt();
			 if (menu<1||menu>5) {
				isRight=true;
				System.out.println("输入错误,请重新选择数字:");
				menu=inputScanner.nextInt();
			}
		switch (menu) {
		case 1:
			System.out.println("客户信息管理");
			break;
		case 2:
			System.out.println("购物结算");
			break;
		case 3:
			System.out.println("真情回顾");
			break;
		case 4:
			System.out.println("注销");
			break;
		default:
			break;
		}
		isRight=false;
		System.out.println("");
		System.out.println("程序结束");
		} while (isRight);
	}
}
