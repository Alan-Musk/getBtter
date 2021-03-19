/**
 * @title  test_05.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午2:14:25 

 */
package chap_07;

import java.util.Scanner;

//添加用户信息
public class test_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("青鸟迷你游戏平台>添加用户信息\n");
		System.out.println("请输入要录入用户的数量:");
		int num=input.nextInt();//用户数量
		for (int i = 0; i < num; i++) {
			System.out.println("请输入用户编号(<4位整数>):");
			int userId=input.nextInt();
			if (userId<1000||userId>9999) {
				System.out.println("用户编号输入有误,请重新输入");
				System.out.println("录入信息失败");
				i--;//保证输入正确用户达到num
				continue;
			}
			System.out.println("请输入用户的年龄:");
			int age=input.nextInt();
			if (age<10) {
				System.out.println("抱歉您的年龄不适宜玩游戏");
				System.out.println("录入信息失败");
				i--;
				continue;
			}
			System.out.println("请输入会员积分:");
			int score=input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println("用户编号:"+userId+"\t年龄:"+age+"\t积分:"+score);
		}
	}
}
