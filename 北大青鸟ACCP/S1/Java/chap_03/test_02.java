/**
 * @title  test_02.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午10:22:50 

 */
package chap_03;

import java.util.Scanner;

//实现会员信息录入功能
public class test_02 {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.println("请输入会员号");
		Scanner inputScanner=new Scanner(System.in);
		double custNo=inputScanner.nextDouble();
		if (custNo/1000>=1&&custNo/1000<10) {
			System.out.println("请输入会员生日月/日<用两位数表示>");
			String custBirthString=inputScanner.next();
			System.out.println("请输入积分");
			int custScore=inputScanner.nextInt();
			System.out.println("已录入的会员信息是:");
			System.out.println(custNo+"\t"+custBirthString+"\t"+custScore);
		} else {
			System.out.println("信息录入失败");
		}	
	}
}
