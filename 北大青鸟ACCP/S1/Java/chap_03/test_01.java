/**
 * @title  test_01.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午6:27:39 

 */
package chap_03;

import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>幸运抽奖");
		//输入会员卡号
		System.out.println("请输入四位会员卡号:");
		Scanner inputScanner=new Scanner(System.in);
		int custNo=inputScanner.nextInt();//会员卡号
//		获取百位数字
		int baiwei=custNo/100%10;//分解获得百位
		//产生随机数
		int random=(int)(Math.random()*10);
		if (random==baiwei) {
			System.out.println(custNo+"号客户是幸运观众,获得精美MP3一个");
		} else {
			System.out.println(custNo+"号客户,谢谢您的支持");
		}
	}
}
