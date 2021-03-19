/**
 * @title  after_QuessMachine.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午3:52:18 

 */
package chap_12;

import java.util.Scanner;

public class after_QuessMachine {
	String nameString;//竞猜物品的商品
	double money;//价格
	public void initial() {
		System.out.println("请设定竞猜的商品");
		Scanner input = new Scanner(System.in);
		nameString=input.next();
		System.out.println("请选择竞猜的价格");
		money=input.nextDouble();
	}
	public void guess() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i <4; i++) {
			System.out.println("请猜测"+nameString+"的价格:");
			int nameMoney=input.nextInt();
			if (nameMoney>money) {
				System.out.println("再小点");
			}else if (nameMoney<money) {
				System.out.println("再大点");
			}else if (nameMoney==money) {
				System.out.println("您猜对了");
				break;
			}
		}
	}
}
