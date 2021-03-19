/**
 * @title  test_03.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午5:14:11 

 */
package chap_06;

import java.util.Scanner;

//循环录入会员信息,升级了一下,输入有误的时候,不会叠加次数
public class test_03 {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		int custNo=0;//会员号
		String birthday="";//会员生日
		int points=0;//会员积分
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			//循环录入会员信息
			System.out.println("请输入会员号(<4位整数>)");
			custNo=input.nextInt();
			if (custNo<1000||custNo>9999) {
				System.out.println("会员号输入有误,请重新输入");
				i--;
				continue;
			}
			System.out.println("请输入会员生日(月/日<用两位整数表示>):");
			birthday=input.next();
			System.out.println("请输入会员积分:");
			points=input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println(custNo+"\t"+birthday+"\t"+points);
			System.out.println();
		}
		System.out.println("程序结束");
	}
}
