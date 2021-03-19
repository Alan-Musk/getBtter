/**
 * @title  test_Menu.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午1:21:04 

 */
package chap_12;

import java.util.Scanner;

//菜鸟类
public class test_Menu {
	//显示登录菜单
	public void showLoginMenu() {
		System.out.println("\n\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出\n");
		System.out.println("******************");	
		System.out.println("请选择输入数字:");
	}
	//显示主菜单
	public void showMainMenu() {
		System.out.println("\n\t我行我素购物管理系统主菜单\n");
		System.out.println("******************");		
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回顾\n");
		System.out.println("******************");		
		System.out.println("请选择,输入数字或按0返回上一级菜单:");
		boolean choose;
		do {
			choose=false;
			//输入数字,选择菜单
			Scanner input = new Scanner(System.in);
			int no=input.nextInt();
			if (no ==1) {
				showCustMenu();
			}else if (no==2) {
				showSendGMenu();
			}else if (no==0) {
				showLoginMenu();
			}else {
				System.out.println("输入错误,请重新输入数字:");
				choose=true;
			}
		} while (choose);
	}
	//显示客户信息管理菜单
	public void showCustMenu() {
		System.out.println("\n\t我行我素管理系统>客户信息管理");
		System.out.println("******************\n");	
		System.out.println("1.显示所有客户信息");
		System.out.println("2.添加客户信息");
		System.out.println("3.修改客户信息");
		System.out.println("4.查询客户信息");
		System.out.println("******************");	
		System.out.println("请选择,输入数字或按0返回上一级菜单:");
		boolean choose;
		do {
			choose=false;
			//输入数字,选择菜单
			Scanner input = new Scanner(System.in);
			int no=input.nextInt();
			if (no ==1) {
				System.out.println("显示所有客户信息");
			}else if (no==2) {
				System.out.println("添加客户信息");
			}else if (no==0) {
				showMainMenu();
			}else if (no==3) {
				System.out.println("修改客户信息");
			}else if (no==4) {
				System.out.println("查询客户信息");
			}else{
				System.out.println("输入错误,请重新输入数字:");
				choose=true;
			}
		} while (choose);
	}
	//显示真情回顾菜单
	public void showSendGMenu(){
		System.out.println("\n\t我行我素购物管理系统>真情回馈");
		System.out.println("******************\n");	
		System.out.println("\t\t1.幸运大放送\n");
		System.out.println("\t\t2.幸运抽奖\n");
		System.out.println("\t\t3.生日问候\n");
		System.out.println("******************");	
		System.out.println("请选择,输入数字或按0返回上一级菜单:");
		boolean chooes;
		do {
			chooes=false;
			Scanner input = new Scanner(System.in);
			int num=input.nextInt();
			if (num==1) {
				System.out.println("幸运大放送");
			}else if (num==2) {
				System.out.println("幸运抽奖");
			}else if (num==3) {
				System.out.println("生日问候");
			}else {
				System.out.println("输入错误,请重新输入");
				chooes=true;
			}
		} while (chooes);
	}
}
