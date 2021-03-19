/**
 * @title  test_01.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午2:21:20 

 */
package chap_04;

import java.util.Scanner;

//升级菜单选择功能
public class test_01 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner( System.in);
		//		系统登录菜单
		System.out.println("欢迎使用我行我素购物系统");
		System.out.println();
		System.out.println("\t1.登录系统");
		System.out.println();
		System.out.println("\t2.退出");
		System.out.println();
		System.out.println("***************************");
		System.out.println("请选择,输入数字:");
		int menu=inputScanner.nextInt();
		switch (menu) {
		case 1:
//			系统主菜单
			System.out.println("欢迎使用我行我素购物系统");
			System.out.println("***************************");
			System.out.println("\t1.客户信息管理");
			System.out.println();
			System.out.println("\t2.购物结算");
			System.out.println();
			System.out.println("\t3.真情回馈");
			System.out.println();
			System.out.println("\t4.注销");
			System.out.println();
			System.out.println("***************************");
			System.out.println("请选择,输入数字:");
			break;
		case 2:
			System.out.println("谢谢您的使用");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
}
