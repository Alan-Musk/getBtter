/**
 * @title  example_05.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午3:20:46 

 */
package chap_06;

import java.util.Scanner;

public class example_05 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("查看日程表,请输入日期(1-5):");
		int day=input.nextInt();
		switch (day) {
		case 1:
			System.out.println("出席IT科技展剪彩仪式");
			break;
		case 2:
			System.out.println("飞抵香港参加亚太区会议");
			break;
		case 3:
			System.out.println("会议结束游香港海洋公园");
			break;
		case 4:
			System.out.println("抵京召开月度股东大会");
			break;
		case 5:
			System.out.println("自由时间");
			break;
		default:
			break;
		}
	}
}
