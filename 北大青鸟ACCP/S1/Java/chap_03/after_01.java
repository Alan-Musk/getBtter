/**
 * @title  after_01.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月6日 下午11:23:15 

 */
package chap_03;

import java.util.Scanner;

//某人去海南旅游
public class after_01 {
	public static void main(String[] args) {
		int money=5000;//机票价格
		System.out.println("请输入您出行的月份:1-12");
		Scanner inputScanner=new Scanner(System.in);
		int moon=inputScanner.nextInt();
		System.out.println("请问您选择头等舱还是经济舱?头等舱输入1,经济舱输入2");
		int ticket=inputScanner.nextInt();
		if (moon>=4&&moon<=10) {
			if (ticket==1) {
				money=(int) (money*0.9);
			} else if(ticket==2) {
				money=(int)(money*0.8);
			}
		} else {
			if (ticket==1) {
				money=(int) (money*0.5);
			} else if(ticket==2) {
				money=(int)(money*0.4);
			}
		}
		System.out.println("您的机票价格为"+money);
	}
}
