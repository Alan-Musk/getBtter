/**
 * @title  after_04.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午11:44:33 

 */
package chap_09;

import java.util.Scanner;

public class after_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money=0;//取钱金额
		for (int i = 0; i <3; i++) {
			System.out.println("请输入密码");
			int pw=input.nextInt();//密码
			if (pw!=111111) {
				continue;
			}
			for (int j = 0; j <3; j++) {
				System.out.println("请输入金额:");
				money=input.nextInt();
				if (money%100!=0||money>1000||money<0) {
					System.out.print("输入金额有误!");
					continue;
				}
			}
			System.out.println("您取得"+money);
			System.out.println("交易完成,请取卡");
			break;
		}
	}
}
