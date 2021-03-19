/**
 * @title  mian_menu.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午1:47:30 

 */
package chap_12;

import java.util.Scanner;

//test_Menu实现类
public class mian_menu {
	public static void main(String[] args) {
		test_Menu menu=new test_Menu();
		StartSMS sms=new StartSMS();
		boolean choose=true;
		int choice;//选择
		do {
//			显示登录菜单
			menu.showLoginMenu();
			//实现菜单
			Scanner input = new Scanner(System.in);
			choice=input.nextInt();
			switch (choice) {
			case 1:
				do {
					choose=false;
					//登录判断
					if (sms.reNameString().equals("JadeBird")&&sms.rePwString().equals("000000")) {
						System.out.println("@@登录成功:"+sms.name+"@@");
					}else {
						System.out.println("@@您没有权限进入系统,请重新登录.@@");
						choose=true;
					}
				} while (choose);
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("谢谢你的使用!");
				choose=false;
			}
		} while (choose);
	}
}
