/**
 * @title  Account_Main.java 

 * @package bank.com 

 * @author alan

 * @date 2021年3月17日 下午3:51:37 

 */
package bank.com;

import java.util.Scanner;

//上机5
public class Account_Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account=new Account();
		int choice=0;//选择业务
		double money=0;//初始化金额
		do {
			System.out.println("1.存款2.取款0.退出");
			System.out.println("请选择你需要办理的业务:");
			choice=input.nextInt();
			switch (choice) {
			case 1:	
				money=account.setBank(money);
				System.out.println("\n****当前余额为:"+money+"元******");
				break;
			case 2:		
				money=account.getBank(money);
				System.out.println("\n****当前余额为:"+money+"元******");
				break;
			default:
				break;
			}
		} while ((int) choice!=0);
		System.out.println("感谢您的使用");
	}
}
