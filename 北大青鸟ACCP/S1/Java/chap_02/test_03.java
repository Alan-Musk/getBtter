/**
 * @title  test_03.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月5日 上午10:30:32 

 */
package chap_02;

import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		//输入会员卡号
		System.out.println("请输入四位会员卡号:");
		Scanner inputScanner=new Scanner(System.in);
		int custNo=inputScanner.nextInt();//会员卡号
//		获取每位数字
		int gewei=custNo%10;//分解获取个位数
		int shiwei=custNo/10%10;//分解获得十位
		int baiwei=custNo/100%10;//分解获得百位
		int qianwei=custNo/1000;//分解获得千位
		//计算数字之和
		int sum=gewei+baiwei+shiwei+qianwei;
		System.out.println("会员卡号"+custNo+"总和为"+sum);
		boolean isLuck=sum>20;
		System.out.println("是幸运观众吗"+isLuck);
	}
}
