/**
 * @title  test_04.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午1:57:45 

 */
package chap_07;

import java.util.Scanner;

//统计游戏点击率
public class test_04 {
	public static void main(String[] args) {
		System.out.println("青鸟迷你游戏平台>游戏点击率\n");
		Scanner input = new Scanner(System.in);
		int count=0;//超过100的个数
		for (int i = 1; i < 5; i++) {
			System.out.println("请输入第"+i+"个游戏的点击率:");
			int num=input.nextInt();
			if (num>=100) {
				count++;
			}
		}
		System.out.println("点击率大于100的游戏数是:"+count);
		System.out.println("占比例为"+((double)count/4*100)+"%");
	}
}
