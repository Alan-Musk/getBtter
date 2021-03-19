/**
 * @title  test_04.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月5日 上午10:53:50 

 */
package chap_02;

import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		int shirtPrice=245;//T恤的单价
		int shoePrice=570;//网球鞋的单价
		int padPrice=320;//网球拍的单价
		//用户输入商品折扣
		Scanner input=new Scanner(System.in);
		System.out.println("请输入折扣");
		double discount=input.nextDouble();//商品折扣
		//计算商品享受折扣之后的价格
		double shirtPriceDis=shirtPrice*discount;
		double shoePriceDis=shoePrice*discount;
		double padPriceDis=padPrice*discount;
//		判断商品折后价格是否低于100
		boolean shirtPriceDisBool=shirtPriceDis<100;
		boolean shoePriceDisBool=shoePriceDis<100;
		boolean padPriceDisBool=padPriceDis<100;
//输出
		System.out.println("T恤折扣低于100吗?"+shirtPriceDisBool);
		System.out.println("网球鞋折扣低于100吗?"+shoePriceDisBool);
		System.out.println("网球拍折扣低于100吗?"+padPriceDisBool);
	}
}
