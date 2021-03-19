/**
 * @title  test_03.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午12:48:17 

 */
package chap_07;

import java.util.Scanner;

//玩游戏并支付游戏币
public class test_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money=0;//小时单价
		String typeNameString="";//游戏名称
		double discount=0;//折扣
		System.out.println("青鸟迷你游戏平台>游戏币支付\n");
		System.out.println("请选择您玩的游戏类型:");
		System.out.println("\t1.牌类");
		System.out.println("\t2.休闲竞技类");
		int typeGame=input.nextInt();
		System.out.println("请您选择游戏时长:");
		double timeGame=input.nextDouble();
		//计算折扣
		if (timeGame>=10) {
			discount=0.5;
		}else {
			discount=0.8;
		}
		switch (typeGame) {
		case 1:
			typeNameString="牌类";
			money=10;
			break;
		case 2:
			typeNameString="休闲竞技类";
			money=20;
		default:
			System.out.println("请按规范输入");
			break;
		}
		System.out.println("您玩的是"+typeNameString+",时长是:"+timeGame+"小时,可以享受"+discount+"折优惠");
		System.out.println("您需要支付"+(timeGame*money*discount)+"个游戏币");
	}
}
