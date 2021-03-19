/**
 * @title  test_01.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月9日 下午11:58:27 

 */
package chap_07;

import java.util.Scanner;

//选择游戏
public class test_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//基础代码
		System.out.println("欢迎进入青鸟游戏迷你平台\n");
		System.out.println("请选择您喜爱的游戏:\n");
		System.out.println("**************************");
		System.out.println("\t1.斗地主");
		System.out.println("\t2.斗牛");
		System.out.println("\t3.泡泡龙");
		System.out.println("\t4.连连看");
		System.out.println("**************************\n");
		System.out.println("请选择,输入数字:");
		int gameChoose=input.nextInt();//变量游戏编号
		//switch结构
		switch (gameChoose) {
		case 1:
			System.out.println("您已经进入斗地主房间");
			break;
		case 2:
			System.out.println("您已经进入斗牛房间");
			break;
		case 3:
			System.out.println("您已经进入泡泡龙房间");
			break;
		case 4:
			System.out.println("您已经进入连连看房间");
			break;
		default:
			break;
		}
	}
}
