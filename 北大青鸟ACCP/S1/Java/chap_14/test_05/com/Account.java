/**
 * @title  Account.java 

 * @package bank.com 

 * @author alan

 * @date 2021年3月17日 下午3:36:41 

 */
package bank.com;

import java.util.Scanner;

//上机5
public class Account {
	Scanner input = new Scanner(System.in);
//	存款
	public double setBank(double money) {
		System.out.println("请输入存款金额");
		money=input.nextDouble()+money;
		System.out.println("存款成功");
		return money;
	}
//取款
	public double getBank(double money) {
		System.out.println("请输入取款金额:");
		double getMoney=input.nextDouble();
		if(getMoney<=money) {
			money=money-getMoney;
		}else {
			System.out.println("您的存款不足,请重新选择业务");
		}
		return money;
	}
}
