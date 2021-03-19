/**
 * @title  after_04.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月9日 上午5:46:32 

 */
package chap_05;

import java.util.Scanner;

public class after_04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=1;//输入的数值,初始化
		String weekString="";//星期缩写
		while (num!=0) {
			System.out.println("请输入数字1-7(输入0结束)");
			num=input.nextInt();
			switch (num) {
			case 1:
				weekString="MON";
				break;
			case 2:
				weekString="TUE";
				break;
			case 3:
				weekString="WED";
				break;
			case 4:
				weekString="THU";
				break;
			case 5:
				weekString="FRI";
				break;
			case 6:
				weekString="SAT";
				break;
			case 7:
				weekString="SUN";
				break;
			}
			System.out.println("今天是"+weekString);
		}
		System.out.println("程序结束");
	}
}
