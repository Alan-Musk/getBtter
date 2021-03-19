/**
 * @title  after_summer.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午3:32:59 

 */
package chap_12;

import java.util.Scanner;

public class after_summer {
	public void choose() {
		System.out.println("请输入月份");
		Scanner input = new Scanner(System.in);
		int moon=input.nextInt();
		switch (moon) {
		case 1:
		case 2:
		case 3:
			spring();
			break;
		case 4:
		case 5:
		case 6:
			summer();
			break;
		case 7:
		case 8:
		case 9:
			fall();
			break;
		case 10:
		case 11:
		case 12:
			winter();
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}
	//春
	public void spring() {
		System.out.println("该季节为春季");
	}
//	夏
	public void summer() {
		System.out.println("夏季");
	}
	public void fall() {
		System.out.println("秋季");
	}
	public void winter(){
		System.out.println("冬季");
	}
}
