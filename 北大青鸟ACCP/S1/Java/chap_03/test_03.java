/**
 * @title  test_03.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月6日 下午10:11:35 

 */
//
//升级购物管理系统,按会员优惠计划进行购物结算
package chap_03;

import java.util.Scanner;

//升级购物系统,按优惠价格进行结算
public class test_03 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("请输入是否是会员:是(y)/否(其他字符)");
		String identity=inputScanner.next();
		System.out.println("请输入购物金额");
		double money=inputScanner.nextDouble();
		if (identity.equals("y")) {
			if (money>=200) {
				money=money*0.75;
			} else {
				money=money*0.8;
			}
		} else {
			//非会员
			if (money>=100) { 
				money=money*0.9;
			}
		}
		System.out.println("实际支付:"+money);
	}
}
