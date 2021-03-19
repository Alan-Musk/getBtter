/**
 * @title  test_02.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午12:02:54 

 */
package chap_07;

import java.util.Scanner;

//玩游戏并晋级
public class test_02 {
	public static void main(String[] args) {
		System.out.println("青鸟迷你游戏平台>游戏晋级\n");
		Scanner input = new Scanner(System.in);
		int i=1;//局数
		int score=0;//分数
		String gameNext="";//继续下一局
		int num=0;//超过80的个数
		//do-while循环游戏
		do {
			System.out.println("您正在玩第"+i+"局,成绩为:");
			score=input.nextInt();
			if (score>=80) {
				num++;
			}
			System.out.println("继续玩下一局嘛?(yes/no):");
			gameNext=input.next();
			i++;
		} while (gameNext.equals("yes")&&i<=5);
		//结束判定
		if (i>5) {
			System.out.println("您已游玩五次,游戏结束");
			double rate=(double)num/5;//double必需,不然rate为0
			if (rate>=0.8) {
				System.out.println("恭喜你,通过一级");
			} else if(rate>=0.6) {
				System.out.println("恭喜你,通过二级");
			}else {
				System.out.println("对不清,您未能晋级,继续加油啊");
			}
		}else if (i<=5) {
			System.out.println("您已经中途退出比赛");
			System.out.println("对不清,您未能晋级,继续加油啊");
		}
	}
}
