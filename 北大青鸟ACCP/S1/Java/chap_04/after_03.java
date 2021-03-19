/**
 * @title  after_03.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午8:39:22 

 */
package chap_04;

import java.util.Scanner;

public class after_03 {
	public static void main(String[] args) {
		double money=0;//折扣力度
		Scanner input=new Scanner(System.in);
		System.out.println("请选择1.经济舱  2.头等舱");
		if (input.hasNextInt()) {
			int ticket=input.nextInt();
			if (ticket==1) {
				//经济舱
					System.out.println("请选择出行的月份");
					int moon=input.nextInt();
					switch (moon) {
//					旺季
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
						money=0.8;
						break;
					default:
						//淡季
						money=0.4;
						break;
					}
			} else if(ticket==2){
//				头等舱
				System.out.println("请选择出行的月份");
				int moon=input.nextInt();
				switch (moon) {
				//旺季
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					money=0.9;
					break;
				default:
					//淡季
					money=0.5;
					break;
				}
			}else {
				System.out.println("请按规定输入");
			}
		} else {
			System.out.println("请按规定输入");
		}
		System.out.println("您选择的机票价格为"+(5000*money));
	}
}
