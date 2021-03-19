/**
 * @title  example_04.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午8:18:42 

 */
package chap_09;

import java.util.Scanner;

public class example_04 {
	public static void main(String[] args) {
		int count=0;//计数器,记录一共买了几件衣服
		String choiceString;//顾客选择是否离开
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("欢迎光临第"+(i+1)+"家专卖店");
			for (int j = 0; j <3; j++) {
				System.out.println("要离开吗(y/n)?");
				choiceString=input.nextLine();
				//如果离开,则跳出,进行下一家店
				if ("y".equals(choiceString)) {
					break;
				}
				System.out.println("买了一件衣服");
				count++;//计数器加1
			}
			System.out.println("离店结账");
		}
		System.out.println("总共买了"+count+"件衣服");
	}
}
